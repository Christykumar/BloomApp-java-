package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.UserManager;

public class UserNameTest {

	@Test
	public void test1() {
		
		//test case 1 valid user name
		
		String userName="christina";
		boolean valid=UserManager.userNameIsValid(userName);
		assertEquals(true,valid);
	}
	
	@Test
	public void test2() {
		
		//test case 1 invalid user name
		
		String userName="chr";
		boolean valid=UserManager.userNameIsValid(userName);
		assertEquals(false,valid);
	}
	
	@Test
	public void test3() {
		
		//test case 1 invalid user name
		
		String userName="        ";
		boolean valid=UserManager.userNameIsValid(userName);
		assertEquals(false,valid);
	}

}
