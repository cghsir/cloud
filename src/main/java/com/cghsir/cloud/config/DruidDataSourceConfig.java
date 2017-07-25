package com.cghsir.cloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * Created by cghsir on 2017/7/24.
 */
@Configuration
public class DruidDataSourceConfig {

    private static final Logger _LOG = LoggerFactory.getLogger(DruidDataSourceConfig.class);

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        _LOG.info("注册druiddatasource:"+druidDataSource.getName());
        return druidDataSource;
    }

}
