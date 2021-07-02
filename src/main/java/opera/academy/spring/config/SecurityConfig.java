package opera.academy.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;
    private final PasswordEncoder encoder;

    public SecurityConfig(UserDetailsService userDetailsService, PasswordEncoder encoder) {
        this.userDetailsService = userDetailsService;
        this.encoder = encoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/register", "/inject").permitAll()
                .antMatchers(HttpMethod.GET,"/stages/", "/performance",
                        "/performance-sessions/available").hasAnyRole("ADMIN", "USER")
                .antMatchers(HttpMethod.POST,"/stages/", "/performance",
                        "/performance-sessions").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,"/performance-sessions").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/users/by-email").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE,"/performance-sessions").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/orders", "/shopping-carts/by-user")
                .hasRole("USER")
                .antMatchers(HttpMethod.POST,"/orders/complete",
                        "/shopping-carts/by-user/*").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}
