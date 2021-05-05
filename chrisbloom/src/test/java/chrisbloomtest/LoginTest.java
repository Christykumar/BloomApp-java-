package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.User;
import chrisbloom.UserManager;

public class LoginTest {

	@Test
	public void test1() {
		
		//test case 1 with registered user
		
		User user1 = new User();

		user1.userName = "christina";
		user1.passWord = "anitsirhc";
		user1.mobileNo = "8072843568";
		user1.address = "Vanagram";
		user1.location = "madurai";
		UserManager.registerUser(user1);
		boolean success = UserManager.login(user1);
		assertEquals(true, success);
		System.out.println("*********************************");
	}

	@Test
	public void test2() {
		
		//test case 2 - with unregistered user
		
		User user2 = new User();

		user2.userName = "muthukumari";
		user2.passWord = "923456789";
		user2.mobileNo = "8072843563";
		user2.address = "K.pudhur";
		user2.location = "virudhunagar";
		boolean success = UserManager.login(user2);
		assertEquals(false, success);
		UserManager.display();
	}
}
