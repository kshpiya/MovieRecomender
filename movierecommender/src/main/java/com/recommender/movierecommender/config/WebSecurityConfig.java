package com.recommender.movierecommender.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.recommender.movierecommender.service.UserService;
 
@Configuration
public class WebSecurityConfig {
 
	@Bean
    UserDetailsService userDetailsService() {
        return new UserService();
    }
     
    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
    @Bean
    DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService((UserDetailsService) userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
         
        return authProvider;
    }
 
    @Bean
    SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/").hasAnyAuthority("USER", "USER")
                .requestMatchers("/create").hasAnyAuthority("ADMIN")
                .requestMatchers("/update/**").hasAnyAuthority("ADMIN")
                .requestMatchers("/remove/**").hasAuthority("ADMIN")
                .requestMatchers("/rate/**").hasAuthority("USER")
                .anyRequest().authenticated()
            )
            .formLogin(login -> login.permitAll())
            .logout(logout -> logout.permitAll())
            .exceptionHandling(eh -> eh.accessDeniedPage("/403"))
            ;
         
        return http.build();
    }
}
