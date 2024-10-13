package se.lexicon.todo_api.service;

import se.lexicon.todo_api.domain.dto.PersonDTOForm;
import se.lexicon.todo_api.domain.dto.PersonDTOView;

import java.util.List;

public interface PersonService {
    PersonDTOView create(PersonDTOForm personDTOForm);

    PersonDTOView findById(Long id);

    List<PersonDTOView> findAll();

    PersonDTOView update(PersonDTOForm personDTOForm);

    void delete(Long id);
}