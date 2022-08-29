package com.springboot.blog.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String resourceName;
	String fieldName;
	long fieldValue;
	String sValue;
	
	//For Id
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	//For name
	public ResourceNotFoundException(String resourceName, String fieldName, String sValue) {
		super(String.format("%s not found with %s : %s",resourceName,fieldName,sValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.sValue = sValue;
	}

	
	
}
