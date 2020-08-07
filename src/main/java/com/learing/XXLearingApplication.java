package com.learing;

import com.learing.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class XXLearingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XXLearingApplication.class, args);
    }


    @Bean
    public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet());
        bean.setLoadOnStartup(1);
        return bean;
    }

}
