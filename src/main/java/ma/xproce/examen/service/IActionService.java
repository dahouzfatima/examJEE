package ma.xproce.examen.service;

import ma.xproce.examen.dao.entities.Action;
import ma.xproce.examen.dao.entities.Don;
import ma.xproce.examen.dtos.ActionDto;
import ma.xproce.examen.dtos.DonDto;

import java.util.List;

public interface IActionService {

    Boolean deleteActionById(Integer id);
    ActionDto uploadAction(ActionDto actionDto);
    List<DonDto> findDonsByAction(Integer id);
}
