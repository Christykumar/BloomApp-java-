package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;


import chrisbloom.UserManager;

public class MobileNumberTest {

	@Test
	public void test1() {
		
		// test case-1 Correct mobile number
		
		String mobileNo="8072843568";
		boolean valid=UserManager.mobileNoIsValid(mobileNo);
		assertEquals(true,valid);
	}
	
	@Test
	public void test2() {	
		
		// test case-2 InCorrect mobile number
		
		String mobileNo1="67644";
		boolean valid=UserManager.mobileNoIsValid(mobileNo1);
		assertEquals(false,valid);
	}
	
	@Test
	public void test3() {	
		
		// test case-3 Already available mobile number
		
		String mobileNo3="0072843568";
		boolean valid=UserManager.mobileNoIsValid(mobileNo3);
		assertEquals(false,valid);
	}

}
