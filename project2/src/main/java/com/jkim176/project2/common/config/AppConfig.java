package com.jkim176.project2.common.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jkim176.project2.common.service.OrderService;

@Configuration
@ComponentScan(basePackages= {"com.jkim176.project2.common"})
@EnableAutoConfiguration
public class AppConfig {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
	}
}
