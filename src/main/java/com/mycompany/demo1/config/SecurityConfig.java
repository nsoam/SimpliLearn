package com.mycompany.demo1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .permitAll()
//                .and().csrf().disable()
                // Make H2-Console non-secured; for debug purposes
                .and().csrf().ignoringAntMatchers("/h2/**")
// Allow pages to be loaded in frames from
// the same origin; needed for H2-Console
                .and().headers().frameOptions().sameOrigin();
    }
}