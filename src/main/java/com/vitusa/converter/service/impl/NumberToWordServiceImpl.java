package com.vitusa.converter.service.impl;

import org.springframework.stereotype.Service;

import com.vitusa.converter.commons.ErrorMessage;
import com.vitusa.converter.commons.NumberNames;
import com.vitusa.converter.commons.RangeNames;
import com.vitusa.converter.commons.TenNames;
import com.vitusa.converter.exception.UnProcessableException;
import com.vitusa.converter.service.NumberToWordService;

@Service
public class NumberToWordServiceImpl implements NumberToWordService {

	@Override
	public String convert(int number) {
		if (number == 0) {
			return "Zero";
		}
		
        String signBit = "";
        String resultWord = "";
        try{
	        if (number < 0) {
	            number = -(number);
	            signBit = "Negative ";
	        }
	        int unitIndex = 0;
	        do {
	            int reminder = number % 1000;
	            if (reminder != 0){
	                String word = prepareNumberUnit(reminder);
	                resultWord = word +" "+RangeNames.values()[unitIndex].getRangeName()+ " "+resultWord;
	            }
	            unitIndex++;
	            number /= 1000;
	        } while (number > 0);
        
        }catch(Exception e){
        	throw new UnProcessableException(ErrorMessage.PROCESS_ERROR.getErrorName());
        }
        
        return signBit + resultWord;
	}
	
	public String prepareNumberUnit(int number) {
        String current;
        try{
	        if (number % 100 < 20){
	        	current = NumberNames.values()[number % 100].getNumberName();
	            number /= 100;
	        }
	        else {
	            current = NumberNames.values()[number % 10].getNumberName();
	            number /= 10;
	            current = TenNames.values()[number % 10].getTenName() + " "+current;
	            number /= 10;
	           
	        }
	        if (number == 0){
	        	return current;
	        }
        }catch(Exception ex){
        	throw new UnProcessableException(ErrorMessage.PROCESS_ERROR.getErrorName());
        }
        return NumberNames.values()[number] + " HUNDRED AND " + current;
    }

}
