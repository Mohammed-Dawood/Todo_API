package se.lexicon.todo_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.todo_api.converter.RoleConverter;
import se.lexicon.todo_api.domain.dto.RoleDTOView;
import se.lexicon.todo_api.domain.entity.Role;
import se.lexicon.todo_api.repository.RoleRepository;
import se.lexicon.todo_api.service.RoleService;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    private final RoleConverter roleConverter;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository, RoleConverter roleConverter) {
        this.roleRepository = roleRepository;
        this.roleConverter = roleConverter;
    }


    @Override
    public List<RoleDTOView> getAll() {
        List<Role> roles = roleRepository.findAll();
        List<RoleDTOView> roleDTOViewList = new ArrayList<>();
        for (Role entity : roles) {
            RoleDTOView dtoView = roleConverter.toRoleDTO(entity);
            roleDTOViewList.add(dtoView);
        }
        return roleDTOViewList;
    }
}