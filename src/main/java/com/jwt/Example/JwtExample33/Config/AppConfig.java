package com.jwt.Example.JwtExample33.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    public UserDetailsService userDetailsService()
    {
        UserDetails user = User.builder().username("Anmol").password("Anmol@123").roles("admin").build();

        return  new InMemoryUserDetailsManager(user);


    }

}
