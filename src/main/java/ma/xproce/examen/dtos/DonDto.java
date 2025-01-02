package ma.xproce.examen.dtos;

import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.xproce.examen.dao.entities.Action;
import ma.xproce.examen.dao.entities.TypeDon;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DonDto {
    private Integer id;
    private String titre;
    private Double montant;
    private TypeDon type;
    private ActionDto action;
}
