package com.vitusa.converter.commons;

public enum NumberNames {

	 BLANK(" "),
     ONE("one"),
     TWO("two"),
     THREE("three"),
     FOUR("four"),
     FIVE("five"),
     SIX("six"),
     SEVEN("seven"),
     EIGHT("eight"),
     NINE("nine"),
     TEN("ten"),
     ELEVEN("eleven"),
     TWELVE("twelve"),
     THIRTEEN("thirteen"),
     FOURTEEN("fourteen"),
     FIFTEEN("fifteen"),
     SIXTEEN("sixteen"),
     SEVENTEEN("seventeen"),
     EIGHTEEN("eighteen"),
     NINTEEN("nineteen");
     
     private String name;

     private NumberNames(String name) {
         this.name = name;
     }

     public String getNumberName() {
         return name;
     }
     
}
