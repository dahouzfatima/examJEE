/*package ma.xproce.examen.security;

import ma.xproce.examen.dao.entities.Organisateur;
import ma.xproce.examen.dao.repositories.OrganisateurRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChariteUserService implements UserDetailsService {
    OrganisateurRepository organisateurRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String login;
        String password;
        List<GrantedAuthority> authorities = new ArrayList<>();
        List<Organisateur> users = organisateurRepository.findByEmail(username);
        if (users.size() == 0) {
            throw new UsernameNotFoundException(username + " Does Not Exist ... " );
        } else {
            login = users.get(0).getEmail();
            password = users.get(0).get();
            authorities.add(new SimpleGrantedAuthority(users.get(0)));
        }
        return new org.springframework.security.core.userdetails.User(login, password, authorities);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}*/
