package com.kkicks.data.springSecurityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/").permitAll()            
                .mvcMatchers("/login").permitAll()            
                .mvcMatchers("/logout").permitAll()            
                .mvcMatchers("/raffle").permitAll()            
                .mvcMatchers("/account/enroll").permitAll()            
                .mvcMatchers("/userInfo/**").authenticated()
                .anyRequest().authenticated()
            .and()
                .formLogin()
            .and()
                .httpBasic();
    }
    
}
