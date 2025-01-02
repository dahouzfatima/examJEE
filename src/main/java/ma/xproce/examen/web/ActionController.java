package ma.xproce.examen.web;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.xproce.examen.dao.entities.Action;
import ma.xproce.examen.dtos.ActionDto;
import ma.xproce.examen.service.IActionService;
import ma.xproce.examen.service.IOrganisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class ActionController {
    IActionService iActionService;
    IOrganisateurService iOrganisateurService;
    @GetMapping(path="/addAction")
    public String addAction(Model model){
        model.addAttribute("action",new ActionDto());
        model.addAttribute("organisateurs",iOrganisateurService.getAllOrgs());
        return "addAction";
    }
    @PostMapping(path="/addAction")
    public String addAction(@Valid @ModelAttribute("action") ActionDto actionDto, BindingResult bindingResult, @RequestParam(name="organisateur_id") String organisatur_id){
        if(organisatur_id==null || organisatur_id.isEmpty()){
            bindingResult.rejectValue("organisateur","error.action","vous devez seletionner un organisateur");

        }
        if(bindingResult.hasErrors()){
            return "addAction";
        }
        else{
            actionDto.setOrganisateur(iOrganisateurService.getOrganisateurById(Integer.parseInt(organisatur_id)));
            if(iActionService.uploadAction(actionDto)!=null){
                return "index";
            }
            else{
                return "error";
            }
        }
    }
    @GetMapping(path="/action/delete")
    public String deleteReser(Integer id){
        if(iActionService.deleteActionById(id)){
            return "redirect:/";
        }
        else{
            return "error";
        }
    }
}
