package ma.xproce.examen;

import lombok.AllArgsConstructor;
import ma.xproce.examen.dao.entities.*;
import ma.xproce.examen.dao.repositories.ActionRepository;
import ma.xproce.examen.dao.repositories.DonRepository;
import ma.xproce.examen.dao.repositories.OrganisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class ExamenApplication {
    OrganisateurRepository organisateurRepository;
    ActionRepository actionRepository;
    DonRepository donRepository;
    public static void main(String[] args) {
        SpringApplication.run(ExamenApplication.class, args);
    }
    @Bean
    public  CommandLineRunner start(){
        return args->{
            Organisateur org=new Organisateur();
            org.setNom("fatima");
            org.setEmail("dahouzfatima23@gmail.com");
            organisateurRepository.save(org);
            Action ac=new Action();
            ac.setEtat(EtatAction.OUVERTE);
            ac.setOrganisateur(org);
            ac.setMontant(190000.0);
            Date d=new Date("12/11/2024");
            ac.setDateCreation(d);
            ac.setTitre("gdwhdnwl");
            ac.setDescription("hsjkahsowkpdlpw");
            actionRepository.save(ac);
            Don don =new Don();
            don.setAction(ac);
            don.setMontant(1500.0);
            don.setType(TypeDon.ARGENT);
            don.setTitre("jgsjhsj");
            donRepository.save(don);
        };

    }
}
