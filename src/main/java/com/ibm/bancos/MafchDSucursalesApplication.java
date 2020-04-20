package com.ibm.bancos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@EnableFeignClients
@SpringBootApplication
public class MafchDSucursalesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MafchDSucursalesApplication.class, args);
		DispatcherServlet dispatcherServlet = (DispatcherServlet)context.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}

}
