package com.SchoolProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;

@Configuration
@EnableWebSecurity
public class WebConfig {
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> requests.requestMatchers(HttpMethod.OPTIONS, "**").permitAll()
				.requestMatchers("/**").permitAll().requestMatchers("/test")
				.access(new WebExpressionAuthorizationManager("hasIpAddress('152.58.199.11') or hasIpAddress('::1')"))
				.anyRequest().authenticated());
		http.sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());
		return http.build();
	}

}
