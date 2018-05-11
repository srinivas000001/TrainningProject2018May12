package com.niit.trainningprojectbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.niit"})
@EnableTransactionManagement

public class DatabaseConfiguration 
{

	/*
	 * Data Base Configurations
	 * */
	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/term";
	private final static String DATABASE_DRIVER = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "sa";
	private final static String DATABASE_PASSOWRD = "sa";
	
	
	/*
	 * DataSource Bean
	 * */
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{

		BasicDataSource basicDataSource = new BasicDataSource();
		
		/*
		 * Giving Data Source Configuration
		 * */
		basicDataSource.setDriverClassName(DATABASE_DRIVER);
		basicDataSource.setUrl(DATABASE_URL);
		basicDataSource.setUsername(DATABASE_USERNAME);
		basicDataSource.setPassword(DATABASE_PASSOWRD);
		
		return basicDataSource;
	}
	
	/*
	 * Session Factory Bean
	 * */
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource){
		
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
				
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.scanPackages("com.niit");
		
		return sessionBuilder.buildSessionFactory();
	}

	/*
	 *For Hibernate Properties 
	 * */
	public Properties getHibernateProperties() {
		
		Properties properties = new Properties(); 
		
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		
		return properties;
	}
	
	/*
	 * Hibernate Transaction Manager
	 * */
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory){
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		
		return transactionManager;
	}
	

}
