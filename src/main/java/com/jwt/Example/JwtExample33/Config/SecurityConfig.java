package com.jwt.Example.JwtExample33.Config;

import com.jwt.Example.JwtExample33.Security.JwtAuthenticationEntryPoint;
import com.jwt.Example.JwtExample33.Security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //Configuration
        http.csrf(csrf->csrf.disable());

        return http.build();
    }
}
