package se.lexicon.todo_api.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDTOView {
    private Long id;
    private String name;
}
