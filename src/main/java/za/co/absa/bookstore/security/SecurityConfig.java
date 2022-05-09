package za.co.absa.bookstore.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/books/**").permitAll()
            .antMatchers("bookList").permitAll()
            .anyRequest().authenticated()

            .and()
            .oauth2Login();
        //disabling Cross site request forgery
        http.csrf().disable();

    }
    //TODO allow access for swagger to be accessed without auth
}
