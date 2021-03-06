package by.anton.spring.security.configuration;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder=User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication().withUser(userBuilder.username("anton").password("anton").roles("EMPLOYEE"))
                .withUser((userBuilder.username("zaur").password("zaur").roles("HR"))).withUser((userBuilder.
                username("ivan").password("ivan").roles("MANAGER","HR")));


    }
}
