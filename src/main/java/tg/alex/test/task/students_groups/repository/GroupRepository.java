package tg.alex.test.task.students_groups.repository;

import tg.alex.test.task.students_groups.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}