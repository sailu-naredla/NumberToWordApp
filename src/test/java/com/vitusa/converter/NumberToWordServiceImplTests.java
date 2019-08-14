package com.vitusa.converter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.vitusa.converter.service.impl.NumberToWordServiceImpl;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class NumberToWordServiceImplTests {
	
	@InjectMocks
	private NumberToWordServiceImpl numberToWordServiceImpl;
	
	@Test
	public void testConvert(){
	
		int number= 128;
		String actualResult = numberToWordServiceImpl.convert(number).trim();
        System.out.println(actualResult);
        assertThat(actualResult).isEqualToIgnoringCase("ONE HUNDRED AND TWENTY EIGHT");
	}
	
	@Test
	public void testPrepareNumberUnit(){
		
		int number= 128;
		String actualResult = numberToWordServiceImpl.prepareNumberUnit(number);
        assertThat(actualResult).isEqualToIgnoringCase("ONE HUNDRED AND TWENTY EIGHT");
	}

}
