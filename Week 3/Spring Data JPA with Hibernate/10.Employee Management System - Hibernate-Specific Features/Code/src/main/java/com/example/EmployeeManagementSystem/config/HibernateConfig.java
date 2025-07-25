package com.example.EmployeeManagementSystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.util.Properties;

@Configuration
public class HibernateConfig {

    public Properties additionalHibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.jdbc.batch_size", "30");
        properties.setProperty("hibernate.order_inserts", "true");
        properties.setProperty("hibernate.order_updates", "true");
        properties.setProperty("hibernate.jdbc.batch_versioned_data", "true");
        return properties;
    }
}
