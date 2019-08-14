package com.vitusa.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vitusa.converter.commons.ErrorMessage;
import com.vitusa.converter.exception.UnProcessableException;
import com.vitusa.converter.service.NumberToWordService;

import static java.lang.System.exit;

@SpringBootApplication
public class NumberToWordApp implements CommandLineRunner{

	@Autowired
	private NumberToWordService numberToWordService;
	
	public static void main(String[] args) {
		SpringApplication.run(NumberToWordApp.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        if (args.length > 0 ) {
        	try{
	        	for(String number : args){
	        		if(number !=null && !number.isEmpty()){
	        			System.out.println("Found Number and word format is: "+numberToWordService.convert(Integer.parseInt(number)));
	        		}
	        	}
        	}catch(Exception e){
        		throw new UnProcessableException(ErrorMessage.ARGUMENT_ERROR.getErrorName());
        	}
           
        } else {
        	System.out.println("Invalid Number"+numberToWordService.convert(980449));
        }

        exit(0);
    }

}
