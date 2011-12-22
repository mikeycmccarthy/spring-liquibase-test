package com.mikeycmccarthy;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes = {StandaloneDataSourceConfig.class, TransactionManagerConfig.class, LiquibaseConfig.class}, loader = AnnotationConfigContextLoader.class)
public class AbstractTransactionalLiquibaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private SpringLiquibase springLiquibase;

    public AbstractTransactionalLiquibaseTest() {
    }
}
