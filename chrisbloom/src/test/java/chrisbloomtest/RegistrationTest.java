package chrisbloomtest;

import static org.junit.Assert.*;
import org.junit.Test;
import chrisbloom.UserManager;
import chrisbloom.Cities;
import chrisbloom.User;

public class RegistrationTest {

	@Test
	public void test1() {
		//test case 1- valid inputs
		User user1 = new User();

		user1.userName = "christina";
		user1.passWord = "anitsirhc";
		user1.mobileNo = "8072843568";
		user1.address = "Vanagram";
		user1.location = "MADURAI";
		boolean status = UserManager.registerUser(user1);
		Cities.cityIsAvailable(user1.location);
		System.out.println("1********************");
		assertEquals(true, status);
		
		//test case-2 with invalid user name
		User user2 = new User();

		user2.userName = "        ";
		user2.passWord = "anitsirhc";
		user2.mobileNo = "8072843566";
		user2.address = "parktown";
		user2.location = "virudhunagar";
		boolean status2 = UserManager.registerUser(user2);
		System.out.println("2********************");
		assertEquals(false, status2);
		
		//test case-3 with invalid mobile number
		User user3 = new User();

		user3.userName = "selva";
		user3.passWord = "selvashankari";
		user3.mobileNo = "8072843";
		user3.address = "Anna nagar";
		user3.location = "trichy";
		boolean status3 = UserManager.registerUser(user3);
		System.out.println("3********************");
		assertEquals(false, status3);

		//test case 4 with invalid address
		User user4 = new User();

		user4.userName = "yazhini";
		user4.passWord = "selvaselva";
		user4.mobileNo = "8072843561";
		user4.address = "       ";
		user4.location = "salem";
		boolean status4 = UserManager.registerUser(user4);
		System.out.println("4********************");
		assertEquals(false, status4);

		//test case 5 with non deliverable city
		User user5 = new User();

		user5.userName = "muthukumari";
		user5.passWord = "123456789";
		user5.mobileNo = "8072843563";
		user5.address = "K.pudhur";
		user5.location = "chennai";
		boolean status5 = UserManager.registerUser(user5);
		System.out.println("5********************");
		assertEquals(false, status5);
		UserManager.display();
		
		User user6 = new User();

		user6.userName = "muthukumari";
		user6.passWord = "123456789";
		user6.mobileNo = "8072843563";
		user6.address = "K.pudhur";
		user6.location = "virudhunagar";
		boolean status6 = UserManager.registerUser(user6);
		System.out.println("6********************");
		assertEquals(true, status6);
		UserManager.display();
		
	}
}
