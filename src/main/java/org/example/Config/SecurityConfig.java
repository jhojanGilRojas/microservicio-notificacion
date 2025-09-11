package org.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // desactiva CSRF para simplificar
                .authorizeHttpRequests(auth -> auth
                        // Swagger debe estar libre
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/v3/api-docs.yaml",
                                "/swagger-resources/**",
                                "/webjars/**"
                        ).permitAll()
                        // Todo lo demás requiere login
                        .anyRequest().authenticated()
                )
                // login por formulario (pantalla de login de Spring)
                .formLogin(Customizer.withDefaults())
                // logout habilitado
                .logout(Customizer.withDefaults());

        return http.build();
    }
}
