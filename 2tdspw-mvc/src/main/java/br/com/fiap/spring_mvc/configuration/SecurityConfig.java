import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecutiry;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity

public class SecurityConfig (
        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
            return httpSeurity.authorizeHttpRequest(
                    .authorizeRequests ->
                        authorizaRequests
                                .requestMatchers("/").permitAll()
                                .requestMatchers("/livro/lista").authenticated()
                                .anyRequest().authenticated()
    )
        .oauth2Login(OAuth2LoginConfigurer<HttpSecurity>oauth2 ->
        oauth2.defaultSucessUrl("/livros/lista"))
        .formLogin(Customizer.withDefault())
        .build();
}



)