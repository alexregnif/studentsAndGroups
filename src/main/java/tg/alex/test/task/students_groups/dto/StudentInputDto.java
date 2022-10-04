package tg.alex.test.task.students_groups.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public final class StudentInputDto {
    private Integer id;
    private String name;
    private LocalDate dateOfComing;
    private Integer groupId;
}
