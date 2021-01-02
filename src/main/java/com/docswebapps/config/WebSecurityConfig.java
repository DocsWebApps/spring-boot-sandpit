package com.docswebapps.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable(); // Required to use H2 in memory DB - remove for Prod
        http.authorizeRequests()
            .antMatchers("/**").permitAll() // remove when finished
            .anyRequest().authenticated()
            .and().cors()
            .and().csrf().disable();
    }

}
