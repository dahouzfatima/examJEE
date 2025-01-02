package ma.xproce.examen.dao.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String description;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateCreation;
    private Double montant;
    private  EtatAction etat;
    @ManyToOne
    private Organisateur organisateur;
    @OneToMany(mappedBy = "action",fetch=FetchType.EAGER)
    private List<Don> dons=new ArrayList<>();
}
