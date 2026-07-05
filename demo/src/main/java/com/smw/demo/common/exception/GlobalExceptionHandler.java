package com.smw.demo.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException e) {
		return ResponseEntity
			.status(HttpStatus.NOT_FOUND)
			.body(ErrorResponse.of(HttpStatus.NOT_FOUND.value(), e.getMessage()));
	}

	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<ErrorResponse> handleDuplicateEmail(DuplicateEmailException e) {
		return ResponseEntity
			.status(HttpStatus.CONFLICT)
			.body(ErrorResponse.of(HttpStatus.CONFLICT.value(), e.getMessage()));
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException e) {
		String message = e.getBindingResult().getFieldErrors().stream()
			.map(error -> error.getField() + ": " + error.getDefaultMessage())
			.findFirst()
			.orElse("잘못된 요청입니다.");
		return ResponseEntity
			.badRequest()
			.body(ErrorResponse.of(HttpStatus.BAD_REQUEST.value(), message));
	}
}
