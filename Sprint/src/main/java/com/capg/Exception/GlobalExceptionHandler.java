package com.capg.Exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	

	

	@ExceptionHandler(PVSBusinessException.class)
	public ResponseEntity<ExceptionResponse> resourceNotFound(PVSBusinessException ex) {
		
	
	
	ExceptionResponse response = new ExceptionResponse();
	response.setErrorCode("505");
	response.setErrorMessage("Enter the current date");

return new ResponseEntity<ExceptionResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
}
	
	
	 
   
	@Override
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String feildName =((FieldError) error).getDefaultMessage();
			String message=error.getDefaultMessage();
			errors.put(feildName, message);
		});
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
		}
		
		
	}
