/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: WebSecurityConfig
 * FileName: WebSecurityConfig
 * Author:   Eilen
 * Date:     2018/6/25 17:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/25
 * @since 1.0.0
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("uu").password("uu").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                    .anyRequest().authenticated()
                .and()
                    .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/loginSuccess")
                    .permitAll()
                .and()
                    .logout()
                    .permitAll();
    }
}
