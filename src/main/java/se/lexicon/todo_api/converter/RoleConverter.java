package se.lexicon.todo_api.converter;

import org.springframework.stereotype.Component;
import se.lexicon.todo_api.domain.dto.RoleDTOForm;
import se.lexicon.todo_api.domain.dto.RoleDTOView;
import se.lexicon.todo_api.domain.entity.Role;

@Component
public interface RoleConverter {
    RoleDTOView toRoleDTO(Role entity);

    Role toEntity(RoleDTOForm dto);
}