package se.lexicon.todo_api.service;

import se.lexicon.todo_api.domain.dto.UserDTOForm;
import se.lexicon.todo_api.domain.dto.UserDTOView;

public interface UserService {

    UserDTOView register(UserDTOForm userDTOForm);

    UserDTOView getByEmail(String email);

    void disableByEmail(String email);

    void enableByEmail(String email);

}
