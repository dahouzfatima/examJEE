package ma.xproce.examen.dao.repositories;

import ma.xproce.examen.dao.entities.Action;
import ma.xproce.examen.dao.entities.Don;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActionRepository extends JpaRepository<Action,Integer> {
}
