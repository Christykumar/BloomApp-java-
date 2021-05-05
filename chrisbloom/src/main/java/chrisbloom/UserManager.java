package chrisbloom;

import java.util.ArrayList;

public class UserManager {

	public static ArrayList<User> userDetails = new ArrayList<User>();
	public static ArrayList<String> availableCities = new ArrayList<String>();

	static {
		availableCities.add("MADURAI");
		availableCities.add("VIRUDHUNAGAR");
		availableCities.add("TRICHY");
		availableCities.add("DINDUGAL");
		availableCities.add("SALEM");
		availableCities.add("COIMBATORE");
	}

	/**
	 * Checks if the user name returns the validity
	 * @param userName
	 * @return
	 */
	public static boolean userNameIsValid(String userName) {

		//checks for blank spaces and length
		if ((userName.trim().equals("") || userName.length() < 4)) {
			System.out.println("Please enter valid username");
			return false;
		}

		// if user name valid return true
		else {
			System.out.println("UserNameValid");
			return true;
		}
	}

	/**
	 * Checks if the password is valid or not
	 * @param passcode
	 * @return
	 */
	public static boolean passcodeIsValid(String passcode) {

		//checks for the empty space and length
		if ((passcode.trim().equals("") || passcode.length() < 7)) {
			System.out.println("Please enter valid password");
			return false;
		}

		// if valid return true
		else {
			System.out.println("passcode Valid");
			return true;
		}
	}

	/**
	 * Checks if the mobile number of the given user is valid or not
	 * @param mobileNo
	 * @return
	 */
	public static boolean mobileNoIsValid(String mobileNo) {

		long mobileNoInt = Long.parseLong(mobileNo);
		int firstno = (int) (mobileNoInt / 1000000000);
 
		//checks for the length of mobile number 
		//returns true if valid
		if (mobileNo.length() == 10 && firstno != 0 && firstno > 5) {
			System.out.println("Mobile number valid");
			return true;
		}

		else {
			System.out.println("Mobile number invalid");
			return false;
		}

	}

	/**
	 * checks if the user address is valid or not 
	 * @param address
	 * @return
	 */
	public static boolean addressIsValid(String address) {
		
		//checks for null input and empty spaces
		if (address.trim().length() == 0 || address == null) {
			System.out.println("Invalid address");
			return false;
		} 
		
		//returns true if it is valid
		else {
			System.out.println("Address is valid");
			return true;
		}
	}


	/**
	 * checks if the userName is already available in the list or not
	 * @param name
	 * @return
	 */
	public static boolean isNameDuplicate(String name) {

		
		boolean exists = false;
		//returns true if the user name is already available
		for (User customer : userDetails) {
			if (customer.userName.equalsIgnoreCase(name)) {
				exists = true;
				break;
			}

		}
		return exists;
	}

	/**
	 * checks if the mobile number is already available in the user list
	 * @param phoneNo
	 * @return
	 */
	public static boolean isMobileNoDuplicate(String phoneNo) {
		boolean exists = false;
		
		//returns true if it is already available
		for(User customer : userDetails) {
			if (customer.mobileNo.equalsIgnoreCase(phoneNo)) {
				exists = true;
				break;
			}

		}
		return exists;
	}

	/**
	 *  checks if the user address is already available in the user list
	 * @param address
	 * @return
	 */
	public static boolean isAddressDuplicate(String address) {
		
		boolean exists = false;
		
		//returns true if it is already available
		for (User customer : userDetails) {
			if (customer.mobileNo.equalsIgnoreCase(address)) {
				exists = true;
				break;
			}

		}
		return exists;
	}
	
	/**
	 * Register the user account by checking all valid credentials
	 * @param buyer
	 * @return
	 */
	public static boolean registerUser(User buyer) {
		boolean status=false;
		
		//checks if the user details is valid or not
		if(UserValidator.isValidUser(buyer)) {
			
			userDetails.add(buyer);
			System.out.println("Registration successfull");
			status=true;

		}
		else {
			System.out.println("Invalid user credentials");
			
		}
		return status;
		}

	/**
	 * checks if the availability of user account and if available logins into the app
	 * @param buyer
	 * @return
	 */
	public static boolean login(User buyer) {
		boolean status=false;
		
		
		if( isNameDuplicate(buyer.userName) || isMobileNoDuplicate(buyer.mobileNo)) {
			System.out.println("Login successfull");
			status= true;
		}
		
		else {
			System.out.println("Login unsuccessfull");
			status= false;
		}
		
		return status;
	}
	
	/**
	 * display all the registered users
	 */
	public static void display() {
		for(User user:userDetails) {
			System.out.println(user.toString());
		}
	}

}
