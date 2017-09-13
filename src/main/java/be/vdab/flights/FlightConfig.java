/*package be.vdab.flights;

import org.hibernate.Hibernate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Date;

@Configuration
public class FlightConfig {      // In uw Config class file ga je alle Java Beans configureren

    @Bean   // Deze bean set je connectie met je database
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setUrl("jdbc:mysql://localhost:3306/Flights");
            ds.setUsername("root");
            ds.setPassword("");
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            return ds;

    }

    @Bean  // verwijzing naar de datasource
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource ds, JpaVendorAdapter jva) {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(ds);
        emf.setJpaVendorAdapter(jva);
        emf.setPackagesToScan("be.vdab.flights");
        return emf;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setGenerateDdl(true);
        adapter.setShowSql(true);
        return adapter;


    }
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);

    }
}*/


/*  comment: deze settings zijn vervangen in de instellingen map recources > file application.properties*/


