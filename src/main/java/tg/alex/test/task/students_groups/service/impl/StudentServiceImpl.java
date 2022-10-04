package tg.alex.test.task.students_groups.service.impl;

import tg.alex.test.task.students_groups.dto.StudentInputDto;
import tg.alex.test.task.students_groups.entity.Student;
import tg.alex.test.task.students_groups.service.StudentService;
import tg.alex.test.task.students_groups.repository.GroupRepository;
import tg.alex.test.task.students_groups.repository.StudentRepository;
import tg.alex.test.task.students_groups.entity.Group;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public final class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    @Override
    public void addStudent(StudentInputDto studentInputDto) {
        Group studentGroup = groupRepository.findById(studentInputDto.getGroupId())
            .orElseThrow(() ->
                new NoSuchElementException(String.format("Group #%d does ot exist!", studentInputDto.getGroupId()))
            );
        Student student = new Student(
            studentInputDto.getId(),
            studentInputDto.getName(),
            studentInputDto.getDateOfComing(),
            studentGroup
        );
        this.studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        this.studentRepository.deleteById(id);
    }
}
