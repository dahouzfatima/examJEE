package ma.xproce.examen.dao.repositories;

import ma.xproce.examen.dao.entities.Organisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganisateurRepository extends JpaRepository<Organisateur,Integer> {
    List<Organisateur> findByEmail(String username);
}
