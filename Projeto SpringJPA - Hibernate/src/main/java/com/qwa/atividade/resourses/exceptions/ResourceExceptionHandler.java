package com.qwa.atividade.resourses.exceptions;

import java.time.Instant;

import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.qwa.atividade.services.exceptions.DatabaseException;
import com.qwa.atividade.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class) //estou tratando essa exceção aqui
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(InvalidDataAccessApiUsageException.class)
	public ResponseEntity<StandardError> transientObject(InvalidDataAccessApiUsageException e, HttpServletRequest request) {
	    String error = "Conflito de dados";
	    HttpStatus status = HttpStatus.CONFLICT; // 409
	    
	    StandardError err = new StandardError(
	        Instant.now(), 
	        status.value(), 
	        error, 
	        "A operação falhou porque referencia um objeto que não foi salvo.", 
	        request.getRequestURI()
	    );
	    
	    return ResponseEntity.status(status).body(err);
	}
}