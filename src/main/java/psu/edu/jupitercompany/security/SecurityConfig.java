package psu.edu.jupitercompany.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	// add support for JDBC ... no more hardcoded users
		@Bean
		public UserDetailsManager userDetaislManager(DataSource dataSource) {
			
			JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
			
			//define query to retrieve a user by username
			jdbcUserDetailsManager.setUsersByUsernameQuery(
					"SELECT user_id, pw, active FROM members WHERE user_id=?"
					);
			
			//define query to retrieve authorities/roles by username
			jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
					"SELECT user_id, role FROM roles WHERE user_id=?"
					);
			
			return jdbcUserDetailsManager;
		}
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	
    	http.authorizeHttpRequests(configurer ->
    	configurer
				.requestMatchers(HttpMethod.GET, "/images/*").permitAll()
    			  .requestMatchers("/employees/list/**").hasRole("EMPLOYEE")
    			  .requestMatchers("/employees//showFormForAdd/**").hasRole("MANAGER")
    			  .requestMatchers("/employees//showFormForUpdate/**").hasRole("MANAGER")
    			  .requestMatchers("/employees/delete/**").hasRole("ADMIN")
    			  .anyRequest().authenticated()
    			)
    			.formLogin(form ->
    					form
    						.loginPage("/login")
    						.loginProcessingUrl("/authenticateTheUser")
    						.permitAll()
    			)
    			.logout(logout -> logout.permitAll()
    					/*)
    			.exceptionHandling(configurer -> 
    						configurer.accessDeniedPage("/access-denied")*/
    					
    					);
    	
    	return http.build();
    }

}
