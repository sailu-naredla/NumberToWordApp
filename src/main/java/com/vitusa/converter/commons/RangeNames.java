package com.vitusa.converter.commons;

public enum RangeNames {

	BLANK(""),
    THOUSAND("thousand"),
    MILLION("million");
    
	
	private String name;

    private RangeNames(String name) {
        this.name = name;
    }

    public String getRangeName() {
        return name;
    }

    
}
