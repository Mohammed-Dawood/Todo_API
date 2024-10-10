package se.lexicon.todo_api.service;

import se.lexicon.todo_api.domain.dto.RoleDTOView;

import java.util.List;

public interface RoleService {
    List<RoleDTOView> getAll();
}