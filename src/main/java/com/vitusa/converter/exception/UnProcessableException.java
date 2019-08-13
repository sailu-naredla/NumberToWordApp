package com.vitusa.converter.exception;

public class UnProcessableException extends RuntimeException {

	private static final long serialVersionUID = -157417501220281926L;

    public UnProcessableException(String message) {
        super(message);
    }

    public UnProcessableException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public UnProcessableException(Throwable throwable) {
        super(throwable);
    }

    
}
