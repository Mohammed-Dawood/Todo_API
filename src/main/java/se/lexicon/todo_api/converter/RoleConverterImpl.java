package se.lexicon.todo_api.converter;

import org.springframework.stereotype.Component;
import se.lexicon.todo_api.domain.dto.RoleDTOForm;
import se.lexicon.todo_api.domain.dto.RoleDTOView;
import se.lexicon.todo_api.domain.entity.Role;

@Component
public class RoleConverterImpl implements RoleConverter {
    @Override
    public RoleDTOView toRoleDTO(Role entity) {
        return RoleDTOView.builder().id(entity.getId()).name(entity.getName()).build();
        // return new RoleDTOView(entity.getId(), entity.getName());
    }

    @Override
    public Role toEntity(RoleDTOForm dto) {
        return Role.builder().id(dto.getId()).name(dto.getName()).build();
        // return new Role(dto.getId(), dto.getName());
    }
}
