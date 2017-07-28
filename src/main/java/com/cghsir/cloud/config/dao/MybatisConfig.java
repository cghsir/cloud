package com.cghsir.cloud.config.dao;

import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by cghsir on 2017/7/25.
 */
@Configuration
public class MybatisConfig {

    private static final Logger _LOG = LoggerFactory.getLogger(MybatisConfig.class);

    @Bean
    public PageHelper pageHelper() {
        _LOG.info("注册MyBatis分页插件PageHelper");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
