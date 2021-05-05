
package chrisbloom;

import java.util.ArrayList;

/**
 * shows user what kind of flower types available in the list(This feature is for user)
 * 
 * @author chri2631
 *
 */
public class FlowerAvailability {

	/**
	 * flowers are categorized into based on its nature(natural and artificial)
	 * 
	 * @param category
	 * @param flowerKind
	 * @return
	 */
	public static boolean selectCategory(String category, String flowerKind) {

		boolean valid = false;
		//checks in the natural flower category if user mentioned for it
		if (category .equalsIgnoreCase("Natural")) {
			ArrayList<String> flowerTypes = new ArrayList<String>();
			flowerTypes.add("Flowers");
			flowerTypes.add("Floral Boquets");
			flowerTypes.add("Floral Decoration");
            
			//returns true if the mention flower is available in the mentioned category else returns false
			for (String flowerType : flowerTypes) {
				if (flowerKind.equals(flowerType)) {
					valid = true;
					break;
				}

				else {
					valid = false;
				}
			}
			System.out.println(category + " " + flowerKind + " Available");
			return valid;
		}

		//checks in the artificial flower category if user mentioned for it
		else if (category .equalsIgnoreCase("Artificial")) {
			ArrayList<String> flowerTypes = new ArrayList<String>();
			flowerTypes.add("Flowers");
			flowerTypes.add("Floral Boquets");
			flowerTypes.add("Floral Decoration");

			//returns true if the mention flower is available in the mentioned category else returns false
			for (String flowerType : flowerTypes) {

				if (flowerKind.equals(flowerType)) {
					valid = true;
					break;
				}

				else {
					valid = false;
				}

			}
			System.out.println(category + " " + flowerKind + " Available");
			return valid;
		}

		//returns false if the mentioned category is not available
		else {
			System.out.println(category + " " + flowerKind + " Not Available");
			return false;

		}
	}
}
