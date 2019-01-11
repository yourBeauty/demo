package com.example.demo.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    UserDetailsService userDetailsService;


    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(1);
        return bean;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // Other configurations
                .headers()
                .cacheControl().disable();

        http.csrf().disable()
                .headers().frameOptions().sameOrigin()

                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()//allow CORS option calls
                .antMatchers("/login**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/img/**").permitAll()
                .antMatchers("/fonts/**").permitAll()
                .antMatchers("/javascript/**").permitAll()
                .antMatchers("/plugin/**").permitAll()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/account/**").authenticated()
                .antMatchers("/transfer/buy/confirm**").authenticated()
                .antMatchers("/admin/**").hasAnyAuthority("ROLE_ADMIN")

                //.anyRequest().hasAnyAuthority("superadmin", "auditstaff", "handlingstaff")
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginProcessingUrl("/logins")
                .usernameParameter("username")
                .passwordParameter("password")
                .failureUrl("/login?error")
                .loginPage("/login")
                .permitAll();
//                .failureHandler(systemAuthenticationFailureHandler)
//                .successHandler(systemAuthenticationSuccessHandler);


      /*  http.logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .invalidateHttpSession(true).logoutSuccessHandler(customLogoutSuccessHandler);

        http.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler);


        http.exceptionHandling().authenticationEntryPoint(customAuthenticationEntryPoint);*/

        http.sessionManagement().maximumSessions(2).sessionRegistry(sessionRegistry());

    }

}
