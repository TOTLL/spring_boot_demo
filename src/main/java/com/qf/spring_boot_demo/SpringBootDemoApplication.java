package com.qf.spring_boot_demo;

import com.qf.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages ="com.qf")
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean testMyFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //命名过滤器
        filterRegistrationBean.setName("newfilter");
        //引入自己写的过滤器对象
        filterRegistrationBean.setFilter(new MyFilter());
        //过滤路径
        filterRegistrationBean.addUrlPatterns("/*");
        //启动顺序
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
