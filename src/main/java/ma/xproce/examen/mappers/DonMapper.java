package ma.xproce.examen.mappers;

import ma.xproce.examen.dao.entities.Action;
import ma.xproce.examen.dao.entities.Don;
import ma.xproce.examen.dtos.ActionDto;
import ma.xproce.examen.dtos.DonDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DonMapper {
    ModelMapper modelMapper=new ModelMapper();
    public DonDto fromDon(Don don ){
        return modelMapper.map(don,DonDto.class);
    }
    public Don fromDonDto(DonDto donDto){
        return modelMapper.map(donDto,Don.class);
    }
}
