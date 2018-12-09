package com.jaiganesh;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jaiganesh.entities.Error;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(value = DummyException.class)
	@ResponseStatus(code = HttpStatus.CONFLICT)
	public Error handleDummyException(DummyException exception) {

		log.error("Dummy exception handled by advice with message:: {}", exception.getLocalizedMessage());

		return new Error(exception.getLocalizedMessage());

	}
}
