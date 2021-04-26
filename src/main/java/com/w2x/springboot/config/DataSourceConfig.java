package com.w2x.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
//@EnableConfigurationProperties(JdbcObj.class)
public class DataSourceConfig {

    /*@Bean
    public DataSource dataSource(JdbcObj jdbcObj) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcObj.getDriverClassName());
        dataSource.setUrl(jdbcObj.getUrl());
        dataSource.setUsername(jdbcObj.getUsername());
        dataSource.setPassword(jdbcObj.getPassword());
        return dataSource;
    }*/

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
