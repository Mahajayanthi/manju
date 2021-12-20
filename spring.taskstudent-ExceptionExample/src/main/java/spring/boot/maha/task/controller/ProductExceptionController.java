package spring.boot.maha.task.controller;

import javax.el.PropertyNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ProductExceptionController extends RuntimeException {
	private static final long serialVersionUID = 1L;
	@ExceptionHandler(value = PropertyNotFoundException.class)
	   public ResponseEntity<Object> exception(PropertyNotFoundException exception) {
	      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
}
}
