package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;


import chrisbloom.UserManager;

public class AddressTest {

	@Test
	public void test1() {

		//Test case1 - valid details
		
		String address="2/31, krishna Nagar, Vanagaram";
		boolean valid=UserManager.addressIsValid(address);
		assertEquals(true,valid);
	}
	@Test
	public void test2() {
		
		//Test case 2- invalid address
		
		String address1="       ";
		boolean valid=UserManager.addressIsValid(address1);
		assertEquals(false,valid);
	}
	

}
