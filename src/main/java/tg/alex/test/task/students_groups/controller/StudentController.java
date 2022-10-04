package tg.alex.test.task.students_groups.controller;

import tg.alex.test.task.students_groups.dto.StudentInputDto;
import tg.alex.test.task.students_groups.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody StudentInputDto studentInputDto) {
        this.studentService.addStudent(studentInputDto);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        this.studentService.deleteStudent(id);
    }
}
