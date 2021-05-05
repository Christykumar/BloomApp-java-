package chrisbloom;

import java.util.HashMap;
import java.util.Set;

/**
 * 
 * @author chri2631
 *
 */
public class BillEstimator {
	public static HashMap<String, Integer> natural = new HashMap<String, Integer>();
	public static HashMap<String, Integer> artificial = new HashMap<String, Integer>();
	

	static {
		natural.put("Normal flower pack", 100);
		natural.put("flower Boquet", 500);
		natural.put("Flower decoration package", 10000);

		artificial.put("Normal flower pack", 120);
		artificial.put("flower Boquet", 700);
		artificial.put("Flower decoration package", 12000);

	}
/**
 * 
 * @param flowerType
 * @param quantity
 * @param category
 * @return
 */
	public static int priceEstimation(String flowerType, int quantity, String category) {
		int total = 0;
		
		if (category.equalsIgnoreCase("Natural")) {
			
			Set<String> keys = natural.keySet();
			for (String key : keys) {
				
				if (flowerType.equalsIgnoreCase(key)) {
					int amount = natural.get(key);
					total = amount * quantity;
					return total;
				}
			}
			
			return total;
		}
		
		else if (category.equalsIgnoreCase("Artificial")) {
			
			Set<String> keys = artificial.keySet();
			for (String key : keys) {
				
				if (flowerType.equalsIgnoreCase(key)) {
					int amount = artificial.get(key);
					total = amount * quantity;
					return total;
				}
			}
			return total;
		} 
		
		else {
			System.out.println("Invalid category please select one between natural and artificial");
			return total;
		}

	}
	
	public static int delivaryChargeCalc(){
		return 0;
		//to do
	}
	public static int peakDayDiscount() {
		return 0;
		//to do
	}
}
