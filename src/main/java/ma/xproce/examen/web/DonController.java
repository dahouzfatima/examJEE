package ma.xproce.examen.web;

import lombok.AllArgsConstructor;
import ma.xproce.examen.dao.entities.TypeDon;
import ma.xproce.examen.dtos.DonDto;
import ma.xproce.examen.service.IActionService;
import ma.xproce.examen.service.IDonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class DonController {
    IDonService iDonService;
    IActionService iActionService;
    @GetMapping(path="/")
    public String afficherDons(Model model){
        model.addAttribute("dons",iDonService.getAllDons());
        return "index";
    }
    @GetMapping(path="/dons")
    public String afficherDons(Model model, @RequestParam(name="actionId") String actionId){
        if(actionId==null || actionId.isEmpty()){
            return "error";
        }
        else{
            List<DonDto> dons=iActionService.findDonsByAction(Integer.parseInt(actionId));
            Double montant_total=0.0;
            for(DonDto don:dons){
                if(don.getType()== TypeDon.ARGENT){
                    montant_total+=don.getMontant();
                }
            }
            model.addAttribute("dons",dons);
            model.addAttribute("montantTotal",montant_total);
            return "index";
        }
    }
}
