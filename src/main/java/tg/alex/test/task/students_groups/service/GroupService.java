package tg.alex.test.task.students_groups.service;

import tg.alex.test.task.students_groups.dto.GroupInfoDto;
import tg.alex.test.task.students_groups.dto.GroupInputDto;

import java.util.List;

public interface GroupService {
    void addGroup(GroupInputDto groupInputDto);

    List<GroupInfoDto> getAllGroups();
}
