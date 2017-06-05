package org.base.oauth2.config;

/**
 * <p>
 * <b>Overview:</b>
 * <p>
 * 
 * 
 * <pre>
 * &#64;projectName SpringOauth2ResourceServer
 * Creation date: May 31, 2017
 * &#64;author Amit Kshirsagar
 * &#64;version 1.0
 * &#64;since
 * 
 * <p><b>Modification History:</b><p>
 * 
 * 
 * </pre>
 */
// @Configuration
// @EnableResourceServer
// public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//
// @Value("${oauth_db}")
// private String oauthDbJdbc;
//
// @Bean
// public TokenStore tokenStore() {
// DataSource tokenDataSource =
// DataSourceBuilder.create().driverClassName("org.sqlite.JDBC").url(oauthDbJdbc)
// .build();
// return new JdbcTokenStore(tokenDataSource);
// }
//
// @Override
// public void configure(ResourceServerSecurityConfigurer resources) throws
// Exception {
// resources.resourceId("jaxenter").tokenStore(tokenStore());
// }
//
// @Override
// public void configure(HttpSecurity http) throws Exception {
// http.authorizeRequests().antMatchers(HttpMethod.GET,
// "/**").access("#oauth2.hasScope('read')")
// .antMatchers(HttpMethod.OPTIONS, "/**").access("#oauth2.hasScope('read')")
// .antMatchers(HttpMethod.POST, "/**").access("#oauth2.hasScope('write')")
// .antMatchers(HttpMethod.PUT, "/**").access("#oauth2.hasScope('write')")
// .antMatchers(HttpMethod.PATCH, "/**").access("#oauth2.hasScope('write')")
// .antMatchers(HttpMethod.DELETE, "/**").access("#oauth2.hasScope('write')");
// }
//
// }