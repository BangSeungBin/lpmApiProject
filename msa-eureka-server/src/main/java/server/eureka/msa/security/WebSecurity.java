package server.eureka.msa.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("discUser").password("discUser").roles("SYSTEM")
                .and()
                .withUser("admin").password("admin").roles("ADMIN")
                .and()
                .withUser("actuator").password("actuator").roles("ACTUATOR");
        ;
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).and()
                .httpBasic().and()/* disable().*/
                //.authorizeRequests()
                //.antMatchers(HttpMethod.GET, "/").permitAll()
                //.antMatchers("/manage/health**").permitAll()
                //.antMatchers("/manage/**").hasRole("ACTUATOR")
                //.antMatchers("/eureka/css/**","/eureka/images/**","/eureka/fonts/**", "/eureka/js/**").permitAll()
                //.antMatchers("/eureka/**").hasRole("SYSTEM")
                //.anyRequest().denyAll()
                .csrf().disable();
    }
}
