package com.example.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//whenever api layer can't find resource it calls ResourceNotFoundException
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;//runtimeexception internally has serializable interface 
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}