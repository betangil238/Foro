package com.alura.foro.infra.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {
@Autowired
	private SecurityFilter security;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpsecurity) throws Exception {
		return httpsecurity.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeHttpRequests()
	            .requestMatchers(HttpMethod.POST,"/login").permitAll()
	            .anyRequest().authenticated().and().addFilterBefore(security, UsernamePasswordAuthenticationFilter.class).build();
	}	
	@Bean
	public AuthenticationManager authentication(AuthenticationConfiguration authenticationConfiguration ) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}
	@Bean
	public PasswordEncoder  PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
