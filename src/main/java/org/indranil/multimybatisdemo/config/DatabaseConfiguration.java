package org.indranil.multimybatisdemo.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfiguration {
	public static final String ONE_DATASOURCE = "OneDS";
	public static final String ANOTHER_DATASOURCE = "AnotherDS";

	@Bean(name = ONE_DATASOURCE, destroyMethod = "")
	@ConfigurationProperties(prefix = "datasources.one")
	@Primary
	public DataSource dataSourceOne() {
		return new HikariDataSource();
	}

	@Bean(name = ANOTHER_DATASOURCE, destroyMethod = "")
	@ConfigurationProperties(prefix = "datasources.another")
	public DataSource dataSourceAnother() {
		return new HikariDataSource();
	}
}
