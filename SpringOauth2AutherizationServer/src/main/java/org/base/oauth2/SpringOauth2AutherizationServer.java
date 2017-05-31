package org.base.oauth2;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 
 * <p>
 * <b>Overview:</b>
 * <p>
 * 
 * 
 * <pre>
 * &#64;projectName SpringOauth2AutherizationServer
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
@SpringBootApplication
@EnableAuthorizationServer
public class SpringOauth2AutherizationServer {
	private static final String CREATE_OAUTH_ACCESS_TOKEN_SQL = "create table if not exists oauth_access_token ("
			+ "token_id VARCHAR(256)," + "token LONGVARBINARY," + "authentication_id VARCHAR(256),"
			+ "user_name VARCHAR(256)," + "client_id VARCHAR(256)," + "authentication LONGVARBINARY,"
			+ "refresh_token VARCHAR(256)" + ");";

	private static final String DELETE_TOKENS_SQL = "delete from oauth_access_token";

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void setUpTokenDatasource() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute(CREATE_OAUTH_ACCESS_TOKEN_SQL);
		jdbcTemplate.execute(DELETE_TOKENS_SQL);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2AutherizationServer.class, args);
	}
}
