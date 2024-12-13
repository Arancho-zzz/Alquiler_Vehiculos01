package co.edu.ue.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConf {

	
	@Bean
	public InMemoryUserDetailsManager userManager() {
		
		List<UserDetails> users = List.of(
				
				User
				.withUsername("SEBASTIAN")
				.password("{noop}1234")
				.roles("ADMIN")
				.build(),
				User
				.withUsername("FABIAN")
				.password("{noop}1234")
				.roles("MOD")
				.build(),
				User
				.withUsername("IVAN")
				.password("{noop}1234")
				.roles("OWNER")
				.build()
				);
		return new InMemoryUserDetailsManager(users);
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(cus->cus.disable())
		.authorizeHttpRequests(aut->
			aut.requestMatchers(HttpMethod.POST,"api/pets").hasAnyRole("UNI")
			.requestMatchers(HttpMethod.PUT,"api/pets-delete/{id}").hasAnyRole("ADMIN")
			.requestMatchers(HttpMethod.GET,"api/pets").authenticated()
			.requestMatchers(HttpMethod.GET,"api/pets-vacum").hasAnyRole("STU")
			.requestMatchers(HttpMethod.PUT,"api/pets").hasAnyRole("ADMIN")		
			
			)
		.httpBasic(Customizer.withDefaults());
		return http.build() ;
		
	}
	
}
