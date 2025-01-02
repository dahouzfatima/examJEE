package ma.xproce.examen.dtos;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ma.xproce.examen.dao.entities.Action;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrganisateurDto {
    private Integer id;
    @NotEmpty
    private String nom;
    @NotNull
    @Email
    private String email;
    private List<ActionDto> actions=new ArrayList<>();
}
