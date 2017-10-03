package com.rudra.aks.consul.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rudra.aks.consul.HealthStatus;

@RestControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler({ ConsulException.class, OutOfMemoryError.class })
	public	ResponseEntity<?>	handle() {
		HealthStatus.msg = "test-consul warn";
		HealthStatus.code = HttpStatus.TOO_MANY_REQUESTS;
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
	}
}
