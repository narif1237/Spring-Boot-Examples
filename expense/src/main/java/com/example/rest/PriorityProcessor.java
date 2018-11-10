package com.example.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("prefix")
@PropertySource("classpath:/application.properties")
public class PriorityProcessor {

	private final Map<String, String> priorityMap = new HashMap<>();

	
		
	public Map<String, String> getPriority() {
		
		return priorityMap;
	}

}
