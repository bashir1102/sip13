package com.springinpractice.ch13.portal.integration.resource;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.hateoas.ResourceSupport;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketStatusResource extends ResourceSupport {
	private String key;
	private String name;
	
	public String getKey() { return key; }
	
	public String getName() { return name; }
}