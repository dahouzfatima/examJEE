package ma.xproce.examen.dtos;

import jakarta.persistence.*;
import lombok.*;
import ma.xproce.examen.dao.entities.Don;
import ma.xproce.examen.dao.entities.EtatAction;
import ma.xproce.examen.dao.entities.Organisateur;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ActionDto {
    private Integer id;
    private String titre;
    private String description;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateCreation;
    private Double montant;
    @NonNull
    private EtatAction etat;
    private OrganisateurDto organisateur;
    private List<DonDto> dons=new ArrayList<>();
}
