package chrisbloom;

import java.util.ArrayList;

public class FlowerManager {

	public static ArrayList<Flower> flowers = new ArrayList<Flower>();

	//Statically available flowers as appended statically
	
	static {
		Flower f1 = new Flower("Natural", "NORMAL FLOWERS",300);
		Flower f2 = new Flower("Natural", "FLORAL BOQUET",1000);
		Flower f3 = new Flower("Natural", "FULL DECORATION PACKAGE",10000);
		Flower f4 = new Flower("Artificial", "NORMAL FLOWERS",100);
		Flower f5 = new Flower("Artificial", "FLORAL BOQUET",600);
		Flower f6 = new Flower("Artificial", "FULL DECORATION PACKAGE",8000);
		flowers.add(f1);
		flowers.add(f2);
		flowers.add(f3);
		flowers.add(f4);
		flowers.add(f5);
		flowers.add(f6);

	}

	
	/**
	 * checks for the input category and appends the flower type in that category
	 * @param newFlower
	 * @return
	 */
	public static boolean addFlower(Flower newFlower) {
		
		// checks for blank spaces
		
		if (newFlower.type.trim().length() == 0) {
			System.out.println("Invalid type of input");
			return false;
		}

		else {

			// checks for category, shows success message and returns true if appended

			if (newFlower.category.equalsIgnoreCase("Natural")) {
				flowers.add(newFlower);
				System.out.println("Successfully added flower type");
				return true;
			}

			// checks for category, shows success message and returns true if appended

			else if (newFlower.category.equalsIgnoreCase("artificial")) {
				flowers.add(newFlower);
				System.out.println("Successfully added flower type");
				return true;
			}

			// if category does not matches shows as invalid input and returns false

			else {
				System.out.println("Invalid category");
				return false;
			}
		}
	}

	
	/**
	 * returns the number of flower types in the category
	 * @param category
	 * @return
	 */
	public static int countFlowers(String category) {

		int natural = 0, artificial = 0,all=0;

		// counts for the number of flower types in the array list
 
		for(Flower item : flowers) {
			
		if (item.category.equalsIgnoreCase("Natural")) {
			natural++;
		}

		else  {
			artificial++;
		}
		
		}
		all= flowers.size();
		
		//checks for the category and displays the count
		
		if(category.equalsIgnoreCase("Natural")) {
			return natural;
		}
		
		else if(category.equalsIgnoreCase("Artificial")){
			return artificial;
		}
		
		else {
			return all;
		}
	}

/**
 *  Deletes any flower type that is not in stock
 * @param oldFlower
 * @return
 */
	public static boolean deleteFlower(Flower oldFlower) {

	// Checks for the category ,if deleted gives the success message and returns
	// true
		
	for(Flower item : flowers) {
	
		if (item.type.equalsIgnoreCase(oldFlower.type)&& item.category.equalsIgnoreCase(oldFlower.category)) {
			flowers.remove(item);
		System.out.println("Successfully Deleted record");
		return true;
		}
		
	}

		System.out.println("Invalid details");
		return false;

	}
	
	/**
	 *  DIsplays all the flowers types under categories with price
	 */
	public static void displayFlowers() {

		System.out.println("**********Flower Types**********");
	
		for (Flower flowerdisplay : flowers) {
			System.out.println(flowerdisplay.toString());
		}

	
		System.out.println("***********************************");
	}

}

//	public count
//	public display
