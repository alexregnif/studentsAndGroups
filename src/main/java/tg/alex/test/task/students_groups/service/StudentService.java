package tg.alex.test.task.students_groups.service;

import tg.alex.test.task.students_groups.dto.StudentInputDto;

public interface StudentService {
    void addStudent(StudentInputDto studentInputDto);

    void deleteStudent(Integer id);
}
