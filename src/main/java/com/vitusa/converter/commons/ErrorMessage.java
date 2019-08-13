package com.vitusa.converter.commons;

public enum ErrorMessage {

	ZERO("zero"),
	PROCESS_ERROR("Unable To Process Given Number Try With Some Other Number"),
	ARGUMENT_ERROR("Error While Reading command line arguments");
	
	
	 private String name;

    private ErrorMessage(String name) {
        this.name = name;
    }

    public String getErrorName() {
        return name;
    }
}
