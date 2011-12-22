# Spring-liquibase-test

Spring provides excellent support for testing data access using JDBC or an ORM tool, including the correctness of SQL statements, Hibernate queries, JPA entity mappings, etc. Spring-liquibase-test is designed to build on this to make it easier to run data-access type tests in a project where Liquibase is being used.

The common tasks this library aims to assist with

* Creation of the needed beans for running data-access tests (in-memory data source, transaction manager)
* Creation and population of an in-memory database using RDBMS agnostic means (via Liquibase)

Spring-liquibase-test takes advantage of the new features of Spring 3.1 in order to do this in such a way that minimal configuration is needed on the part of the developer.