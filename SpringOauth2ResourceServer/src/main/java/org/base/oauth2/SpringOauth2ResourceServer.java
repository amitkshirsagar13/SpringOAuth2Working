package org.base.oauth2;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <p>
 * <b>Overview:</b>
 * <p>
 * 
 * 
 * <pre>
 * &#64;projectName SpringOauth2Demo
 * Creation date: May 30, 2017
 * &#64;author Amit Kshirsagar
 * &#64;version 1.0
 * &#64;since
 * 
 * <p><b>Modification History:</b><p>
 * 
 * 
 * </pre>
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
public class SpringOauth2ResourceServer {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2ResourceServer.class, args);
	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
}
