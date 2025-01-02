package ma.xproce.examen.service;

import lombok.AllArgsConstructor;
import ma.xproce.examen.dao.entities.Don;
import ma.xproce.examen.dao.repositories.DonRepository;
import ma.xproce.examen.dtos.DonDto;
import ma.xproce.examen.mappers.DonMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IDonServiceImpl implements  IDonService{
    DonRepository donRepository;
    DonMapper donMapper;
    @Override
    public List<DonDto> getAllDons() {
        List<Don> dons=donRepository.findAll();
        List<DonDto> donsDto=new ArrayList<>();
        dons.forEach(don->donsDto.add(donMapper.fromDon(don)));
        return donsDto;
    }
}
