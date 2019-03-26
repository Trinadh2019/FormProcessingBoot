package com.trinadh.configclss;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootConfiguration
@ComponentScan(basePackages= {"com.trinadh.model.daos", "com.trinadh.services"})
@EnableAutoConfiguration
@EntityScan(basePackages="com.trinadh.view.vo")
public class TrinadhRootConfigclss {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource);
		
		//hibernate properties
		Properties props = new Properties();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", true);
		props.put("hibernate.use_sql_comments", "true");
		props.put("hiberante.hbm2ddl.auto", "update");
		props.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		props.put("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
		//props.put("hibernate.transaction.coordinator_class", "org.hibernate.resource.transaction.spi.TransactionCoordinatorBuilder");
		bean.setHibernateProperties(props);
		
		bean.setMappingResources(new String[] {"Customer.hbm.xml"});
		
		return bean;
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate();
		
	}
	

}
