package chrisbloom;

import java.util.ArrayList;

public class Cities {
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
	 * Display the available citied for order
	 */
	public static void serviceCities() {

		System.out.println("SERIVICE AVAILABLE IN THE FOLLOWING CITIES ONLY IN CASE OF NATURAL");
		for (String cities : availableCities) {
			
			//Displays the cities where service is available
			System.out.println(cities);
		}

	}

	/**
	 * Checks if delivery available in user city or not
	 * @param city
	 * @return
	 */
	public static boolean cityIsAvailable(String city) {
		
		for (String avalCities : availableCities) {
			
			//checks for the cities where delivery available
			if (avalCities.equalsIgnoreCase(city)) {
				System.out.println("delivery available");
				return true;
			}
			
			else {
				continue;
			}
		}
		
		//return false if the city is not in the delivery list
		System.out.println("item not deliverable");
		return false;
	}

}
