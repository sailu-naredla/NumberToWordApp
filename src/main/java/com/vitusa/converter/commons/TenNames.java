package com.vitusa.converter.commons;

public enum TenNames {

	 BLANK(""),
     TEN("ten"),
     TWENTY("twenty"),
     THIRTY("thirty"),
     FORTY("forty"),
     FIFTY("fifty"),
     SIXTY("sixty"),
     SEVENTY("seventy"),
     EIGHTY("eighty"),
     NINETY("ninety");
     
	private String name;

    private TenNames(String name) {
        this.name = name;
    }

    public String getTenName() {
        return name;
    }
}
