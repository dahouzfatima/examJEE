package ma.xproce.examen.security;

/*
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
public class SecurityConfig {
    ChariteUserService chariteUserService;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((requests)->requests.requestMatchers("/addReservation").hasAuthority("admin").
                requestMatchers("/**").permitAll()).formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());
        http.userDetailsService(chariteUserService);
        return http.build();

    }
} */
