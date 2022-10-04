package tg.alex.test.task.students_groups.service.impl;

import tg.alex.test.task.students_groups.repository.GroupRepository;
import tg.alex.test.task.students_groups.dto.GroupInfoDto;
import tg.alex.test.task.students_groups.dto.GroupInputDto;
import tg.alex.test.task.students_groups.entity.Group;
import tg.alex.test.task.students_groups.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public final class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    @Override
    public void addGroup(GroupInputDto groupInputDto) {
        Group group = new Group();
        group.setGroupName(groupInputDto.getName());
        group.setId(groupInputDto.getId());
        this.groupRepository.save(group);
    }

    @Override
    public List<GroupInfoDto> getAllGroups() {
        List<Group> existGroups = groupRepository.findAll();
        return existGroups.stream()
            .map(g -> new GroupInfoDto(
                    g.getId(),
                    g.getGroupName(),
                    g.getStudents().size()
                )
            )
            .collect(Collectors.toList());
    }
}
