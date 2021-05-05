package chrisbloom;

import java.util.HashMap;
import java.util.Set;

/**
 * this class is for the sales side ,enables to edit the flowers(all, delete ,
 * count and display)
 * 
 * @author chri2631
 *
 */
public class FlowerInventory {
	public static HashMap<String, Integer> natural = new HashMap<String, Integer>();
	public static HashMap<String, Integer> artificial = new HashMap<String, Integer>();

	
	/**
	 * Already available flowers are appended statically in both category
	 */
	static {
		natural.put("Normal flower pack", 100);
		natural.put("flower Boquet", 500);
		natural.put("Flower decoration package", 10000);

		artificial.put("Normal flower pack", 120);
		artificial.put("flower Boquet", 700);
		artificial.put("Flower decoration package", 12000);

	}

	
	/**
	 * checks for the input category and appends the flower type in that category
	 * 
	 * @param flowerType
	 * @param category
	 * @param price
	 * @return
	 */
	public static boolean addFlower(String flowerType, String category, int price) {
        //checks for blank spaces
		if (flowerType.trim().length() == 0) {
			System.out.println("Invalid type of input");
			return false;
		}

		
		else {
			
			// checks for category, shows success message and returns true if appended
			
			if (category.equalsIgnoreCase("Natural")) {
				natural.put(flowerType, price);
				System.out.println("Successfully added flower type");
				return true;
			}

			// checks for category, shows success message and returns true if appended
			
			else if (category.equalsIgnoreCase("artificial")) {
				artificial.put(flowerType, price);
				System.out.println("Successfully added flower type");
				return true;
			}

			// if category does not matches shows as invalid input and returns false
			
			else {
				System.out.println("Invalid input");
				return false;
			}
		}
	}

	
	
	/**
	 * returns the number of flower types in the category
	 * 
	 * @param category
	 * @return
	 */
	public static int countFlowers(String category) {
		
		int noOfFlowers;

		// checks for the category and return number of flower types

		if (category.equalsIgnoreCase("Natural")) {
			noOfFlowers = natural.size();
			
		}

		// checks for the category and return number of flower types
		else if (category.equalsIgnoreCase("Artificial")) {
			noOfFlowers = artificial.size();
			
		}

		// if category input is wrong shows as invalid input
		else {
			System.out.println("Invalid input");
			noOfFlowers= 0;
		}
		return noOfFlowers;
	}

	
	
	/**
	 * Deletes any flower type that is not in stock
	 * 
	 * @param flowerType
	 * @param category
	 * @return
	 */
	public static boolean deleteFlower(String flowerType, String category) {

		// Checks for the category ,if deleted gives the success message and returns
		// true
		
		if (category.equalsIgnoreCase("Natural")) {
			if (natural.containsKey(flowerType)) {
				natural.remove(flowerType);
			}
			System.out.println("Successfully Deleted record");
			return true;
		}

		// Checks for the category , if deleted gives the success message and returns
		// true
		
		else if (category.equalsIgnoreCase("Artificial")) {
			if (artificial.containsKey(flowerType)) {
				artificial.remove(flowerType);
			}
			System.out.println("Successfully Deleted record");
			return true;
		}

		// if the category or flower type not available shows as invalid and returns
		// false
		
		else {
			System.out.println("Invalid details");
			return false;
		}
	}

	
	
	/**
	 * DIsplays all the flowers types under categories with price
	 */
	public static void displayFlowers() {

		System.out.println("**********Flower Types**********");
		System.out.println("Natural");
		Set<String> keys2 = natural.keySet();
		for (String key2 : keys2) {
			int amount = natural.get(key2);
			System.out.println(key2 + " " + ":" + " " + "Rs." + amount);
		}

		System.out.println("Artificial");
		Set<String> keys3 = artificial.keySet();
		for (String key3 : keys3) {
			int amount = artificial.get(key3);
			System.out.println(key3 + " " + ":" + " " + "Rs." + amount);
		}
		System.out.println("***********************************");
	}

}
