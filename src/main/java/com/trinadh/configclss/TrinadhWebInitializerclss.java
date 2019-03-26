package com.trinadh.configclss;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TrinadhWebInitializerclss extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {TrinadhRootConfigclss.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {TrinadhWebConfigclass.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
