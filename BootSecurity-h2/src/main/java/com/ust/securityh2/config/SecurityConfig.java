package com.ust.securityh2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity

public class SecurityConfig {
	
	
	@Bean
    static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	
	 @Bean
	    SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
	        return http.authorizeHttpRequests(registry->{
	        	registry.requestMatchers("/").permitAll();    
	        	registry.requestMatchers("/admin/**").hasRole("ROLE_ADMIN");  
	        	registry.requestMatchers("/user/**").hasRole("ROLE_USER"); 
	        	registry.anyRequest().authenticated();
	        		}).formLogin(AbstractAuthenticationFilterConfigurer :: permitAll)
	        		
	                .build();
	    }
	
//	 @Bean
//	    public DaoManager userDetailsService() {
//	        UserDetails user1 = User.builder()
//	                .username("user")                   
//	                .password(passwordEncoder().encode("userpassword"))  
//	                .roles("USER")                      
//	                .build();
//
//	        UserDetails admin1 = User.builder()
//	                .username("admin")                 
//	                .password(passwordEncoder().encode("adminpassword"))  
//	                .roles("ADMIN")                     
//	                .build();
//
//	        return new DaoManager (user1, admin1);


}
