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
		String actualResult = numberToWordServiceImpl.convert(number);
        System.out.println(actualResult);
        assertThat(actualResult).isEqualTo("ONE HUNDRED AND TWENTY EIGHT");
	}
	
	@Test
	public void testPrepareNumberUnit(){
		
		int number= 788;
		String actualResult = numberToWordServiceImpl.prepareNumberUnit(number);
        assertThat(actualResult).isEqualTo("SEVEN HUNDRED AND EIGHTY EIGHT");
	}

}
