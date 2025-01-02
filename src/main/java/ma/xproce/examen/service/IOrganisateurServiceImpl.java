package ma.xproce.examen.service;

import lombok.AllArgsConstructor;
import ma.xproce.examen.dao.entities.Don;
import ma.xproce.examen.dao.entities.Organisateur;
import ma.xproce.examen.dao.repositories.OrganisateurRepository;
import ma.xproce.examen.dtos.DonDto;
import ma.xproce.examen.dtos.OrganisateurDto;
import ma.xproce.examen.mappers.OrganisateurMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IOrganisateurServiceImpl implements  IOrganisateurService{
    OrganisateurMapper organisateurMapper;
    OrganisateurRepository organisateurRepository;
    @Override
    public OrganisateurDto getOrganisateurById(Integer id) {
        return organisateurMapper.fromOrganisateur(organisateurRepository.findById(id).get());
    }

    @Override
    public List<OrganisateurDto> getAllOrgs() {
        List<Organisateur> orgs=organisateurRepository.findAll();
        List<OrganisateurDto> orgsDto=new ArrayList<>();
        orgs.forEach(org->orgsDto.add(organisateurMapper.fromOrganisateur(org)));
        return orgsDto;
    }
}
