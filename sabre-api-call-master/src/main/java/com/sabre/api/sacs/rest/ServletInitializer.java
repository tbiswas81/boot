package com.sabre.api.sacs.rest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.sabre.api.sacs.config.ConfigurationConfig;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(new Object[] { ConfigurationConfig.class, Application.class });
	}

}
