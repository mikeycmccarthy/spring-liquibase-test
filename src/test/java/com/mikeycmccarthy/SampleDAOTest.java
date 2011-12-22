package com.mikeycmccarthy;

import org.junit.Test;

import javax.annotation.Resource;

import static junit.framework.Assert.assertEquals;

public class SampleDAOTest extends AbstractTransactionalLiquibaseTest {

    @Resource
    private DAOUnderTest testObject = new DAOUnderTest();

    @Test
    public void testPersistingData() throws Exception {
        String meaningOfLifeAnswer = "42";
//        testObject.persistSomething("meaningoflife", meaningOfLifeAnswer);
        String retrievedAnswer = this.simpleJdbcTemplate.queryForObject("SELECT answer from faqs", String.class);
        assertEquals(meaningOfLifeAnswer, retrievedAnswer);
    }

}


