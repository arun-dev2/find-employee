package com.findemployee.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FindEmployeeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = {FindEmployeeConfiguration.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = {"/femp.com/*"};
		return arr;
	}


}
