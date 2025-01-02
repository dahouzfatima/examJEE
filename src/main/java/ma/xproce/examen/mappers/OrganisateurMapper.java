package ma.xproce.examen.mappers;

import ma.xproce.examen.dao.entities.Don;
import ma.xproce.examen.dao.entities.Organisateur;
import ma.xproce.examen.dtos.DonDto;
import ma.xproce.examen.dtos.OrganisateurDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrganisateurMapper {
    ModelMapper modelMapper=new ModelMapper();
    public OrganisateurDto fromOrganisateur(Organisateur organisateur){
        return modelMapper.map(organisateur,OrganisateurDto.class);
    }
     public Organisateur fromOrganisateurDto(OrganisateurDto organisateurDto){
        return modelMapper.map(organisateurDto,Organisateur.class);
    }
}
