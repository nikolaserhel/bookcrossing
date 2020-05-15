package by.serhel.springwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
public class AuthenticationConfig {
    @Bean(name = "auth")
    public Authentication getAuthentication(){
         return SecurityContextHolder.getContext().getAuthentication();
    }
}