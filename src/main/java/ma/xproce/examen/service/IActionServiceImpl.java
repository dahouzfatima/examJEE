package ma.xproce.examen.service;

import lombok.AllArgsConstructor;
import ma.xproce.examen.dao.entities.Action;
import ma.xproce.examen.dao.entities.Don;
import ma.xproce.examen.dao.repositories.ActionRepository;
import ma.xproce.examen.dao.repositories.DonRepository;
import ma.xproce.examen.dtos.ActionDto;
import ma.xproce.examen.dtos.DonDto;
import ma.xproce.examen.mappers.ActionMapper;
import ma.xproce.examen.mappers.DonMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IActionServiceImpl implements IActionService {
    ActionRepository actionRepository;
    DonRepository donRepository;
    ActionMapper actionMapper;
    DonMapper donMapper;

    @Override
    public Boolean deleteActionById(Integer id) {
        try{
            actionRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public ActionDto uploadAction(ActionDto actionDto) {
        return actionMapper.fromAction(actionRepository.save(actionMapper.fromActionDto(actionDto)));
    }

    @Override
    public List<DonDto> findDonsByAction(Integer id) {
        List<Don> dons=donRepository.findAllByActionId(id);
        List<DonDto> donsDto=new ArrayList<>();
        dons.forEach(don->donsDto.add(donMapper.fromDon(don)));
        return donsDto;
    }
}
