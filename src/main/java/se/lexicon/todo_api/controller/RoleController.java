package se.lexicon.todo_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.todo_api.domain.dto.RoleDTOView;
import se.lexicon.todo_api.service.RoleService;

import java.util.List;

@RequestMapping("/api/v1/roles")
@RestController
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<RoleDTOView>> doGetAllRoles() {
        List<RoleDTOView> responseBody = roleService.getAll();
        return ResponseEntity.ok(responseBody);
    }
}
