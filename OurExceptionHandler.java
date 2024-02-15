package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OurExceptionHandler {

	@ExceptionHandler(FileNotFoundException.class)
	public ResponseEntity<String> handleFileNotFound(FileNotFoundException e){
	return 
			new ResponseEntity<String>(
					"File system is not working" ,
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(IOException.class)
	public ResponseEntity<String> handleIOException(FileNotFoundException e){
	return 
			new ResponseEntity<String>(
					"input output Excpetion" ,
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ClassNotFoundException.class)
	public ResponseEntity<String> handleClassNotFoundException(){
		return 
				new ResponseEntity<String>(
						"Class is not available" ,
						HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> handleArithmeticException(){
		return 
				new ResponseEntity<String>(
						"/0 is not allowed" ,
						HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	
}
