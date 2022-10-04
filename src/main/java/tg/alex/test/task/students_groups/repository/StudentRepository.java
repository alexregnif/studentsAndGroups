package tg.alex.test.task.students_groups.repository;

import tg.alex.test.task.students_groups.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
