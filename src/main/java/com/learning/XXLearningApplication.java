package com.learning;

import com.learning.listener.MyListener;
import com.learning.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class XXLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(XXLearningApplication.class, args);
    }


    @Bean
    public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(), "/servlet");
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new MyListener());
        return bean;
    }

}
