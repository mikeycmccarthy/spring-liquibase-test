package com.mikeycmccarthy;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class LiquibaseConfig {

    public static final String DEFAULT_CLASSPATH_LOCATION = "classpath:schema.xml";
    @Autowired
    DataSource dataSource;

    @Bean
    public SpringLiquibase springLiquibase() {
        SpringLiquibase springLiquibase = new SpringLiquibase();
        springLiquibase.setDataSource(dataSource);
        springLiquibase.setChangeLog(DEFAULT_CLASSPATH_LOCATION);
        return springLiquibase;
    }

}
