package ma.xproce.examen.service;

import ma.xproce.examen.dao.entities.Organisateur;
import ma.xproce.examen.dtos.OrganisateurDto;

import java.util.List;

public interface IOrganisateurService {
    OrganisateurDto getOrganisateurById(Integer id);
    List<OrganisateurDto> getAllOrgs();
}
