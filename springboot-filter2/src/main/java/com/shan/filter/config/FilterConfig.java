package com.shan.filter.config;

import com.shan.filter.filter.FirstFilter;
import com.shan.filter.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean firstFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new FirstFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean seFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new SecondFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(2);
        return registrationBean;
    }

}
