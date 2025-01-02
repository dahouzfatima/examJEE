package ma.xproce.examen.mappers;

import ma.xproce.examen.dao.entities.Action;
import ma.xproce.examen.dtos.ActionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ActionMapper {
    ModelMapper modelMapper=new ModelMapper();
    public ActionDto fromAction(Action action){
        return modelMapper.map(action,ActionDto.class);
    }
    public Action fromActionDto(ActionDto actionDto){
        return modelMapper.map(actionDto,Action.class);
    }
}
