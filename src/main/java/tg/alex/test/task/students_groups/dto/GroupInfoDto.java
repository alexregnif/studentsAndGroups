package tg.alex.test.task.students_groups.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public final class GroupInfoDto {
    private Integer groupId;
    private String groupName;
    private Integer numberOfStudents;
}