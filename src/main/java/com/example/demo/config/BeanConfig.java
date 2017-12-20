package com.example.demo.config;

import com.example.demo.listener.JpaCollectionsListener;
import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeanConfig {

    @Bean(name = "dozerMapper")
    public DozerBeanMapper dozerMapper() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

        dozerBeanMapper.setMappingFiles(Arrays.asList("dozer-mapping.xml"));
        dozerBeanMapper.setEventListeners(Arrays.asList(new JpaCollectionsListener()));
        return dozerBeanMapper;
    }
}
