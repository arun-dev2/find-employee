package com.findemployee.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class FindEmployeeInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();

		webAppContext.register(FindEmployeeConfiguration.class);

		DispatcherServlet ds = new DispatcherServlet(webAppContext);

		ServletRegistration.Dynamic customDs = servletContext.addServlet("femp", ds);
		customDs.setLoadOnStartup(1);
		customDs.addMapping("/femp.com/*");
	}

}
