package com.hexa.client;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.hexa")
@PropertySource("classpath:hexa.properties")
public class JdbcConfig {

	@Autowired
	private Environment environment;
	
	@Bean
	@Autowired
	public JdbcTemplate getTemplate(DataSource ds) {
		JdbcTemplate jt =new JdbcTemplate();
		jt.setDataSource(ds);
		return jt;
	}
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("driver"));
        dataSource.setUrl(environment.getProperty("url"));
        dataSource.setUsername(environment.getProperty("uname"));
        dataSource.setPassword(environment.getProperty("pwd"));
        
        return dataSource;
    }
}