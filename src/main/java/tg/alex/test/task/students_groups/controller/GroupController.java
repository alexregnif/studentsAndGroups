package tg.alex.test.task.students_groups.controller;

import tg.alex.test.task.students_groups.dto.GroupInfoDto;
import tg.alex.test.task.students_groups.dto.GroupInputDto;
import tg.alex.test.task.students_groups.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/group")
public final class GroupController {
    private final GroupService groupService;

    @PostMapping("/add")
    public void addGroup(@RequestBody GroupInputDto groupInputDto) {
        this.groupService.addGroup(groupInputDto);
    }

    @GetMapping("/getAllGroups")
    public List<GroupInfoDto> getAllGroups() {
        return this.groupService.getAllGroups();
    }
}
