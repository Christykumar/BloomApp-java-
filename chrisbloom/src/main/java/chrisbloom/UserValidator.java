package chrisbloom;

public class UserValidator {

	
	public static boolean isValidUser(User buyer) {
		
		boolean status=false;
		
		if((!UserManager.userNameIsValid(buyer.userName)) || !UserManager.passcodeIsValid(buyer.passWord) 
				||!UserManager.mobileNoIsValid(buyer.mobileNo)
				|| !UserManager.addressIsValid(buyer.address) ||!Cities.cityIsAvailable(buyer.location)) {
			System.out.println("invalid user credentials");
			status = false;
		} 
		
		else if( UserManager.isNameDuplicate(buyer.userName) && UserManager.isMobileNoDuplicate(buyer.mobileNo)
				&& UserManager.isAddressDuplicate(buyer.address)) {
			System.out.println("User already registered");
			 status=false;
		}
		
		else {
			
			System.out.println("Valid user");
			status=true;
		}
		
		return status;
	
	}
}
