package com.mikeycmccarthy;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Repository
public class DAOUnderTest extends JdbcDaoSupport {

    @Resource
    private DataSource dataSource;

    public void persistSomething(String question, String answer) {
        String query = "INSERT INTO faqs (question,answer) VALUES (?,?)";
        getJdbcTemplate().update(query, question, answer);
    }

}
