/*
 * package com.recommender.movierecommender.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * import org.springframework.security.web.SecurityFilterChain;
 * 
 * import com.recommender.movierecommender.service.UserService;
 * 
 * @Configuration public class WebSecurityConfig {
 * 
 * 
 * @Bean SecurityFilterChain configure(HttpSecurity http) throws Exception {
 * http.authorizeHttpRequests(auth -> auth
 * .requestMatchers("/api/movies").hasAnyAuthority("USER", "ADMIN")
 * .requestMatchers("/api/users/*").hasAnyAuthority("USER", "ADMIN")
 * .requestMatchers("/api/movies/create").hasAnyAuthority("ADMIN")
 * .requestMatchers("/api/movies/update/**").hasAnyAuthority("ADMIN")
 * .requestMatchers("/api/movies/remove/**").hasAuthority("ADMIN")
 * .requestMatchers("/api/rate/**").hasAuthority("USER")
 * .requestMatchers("/h2-console/**").permitAll() .anyRequest().authenticated()
 * ) .formLogin(login -> login.permitAll()) .logout(logout ->
 * logout.permitAll()) .exceptionHandling(eh -> eh.accessDeniedPage("/403")) ;
 * 
 * return http.build(); }
 * 
 * }
 */