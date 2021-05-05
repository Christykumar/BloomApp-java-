
package chrisbloom;


/**
 * shows user what kind of flower types available in the list(This feature is for user)
 * 
 * @author chri2631
 *
 */
public class FlowerAvailability {
	
	
	/**
	 * Checks the  availability of flower type in the list
	 * @param check
	 * @return
	 */
	public static boolean selectCategory(String checkCategory , String checkType){

          
			//returns true if the mentioned flower type is available in the mentioned category else returns false
			for (Flower flowerType : FlowerManager.flowers) {
				if ( flowerType.type.equalsIgnoreCase(checkType)&& flowerType.category.equalsIgnoreCase(checkCategory)) {
					System.out.println(checkCategory + " " + checkType + " Available"+ " in price"+ " "+flowerType.price);
					return true;
					
				}

				else {
					continue;
				}
			}
			System.out.println(checkCategory + " " + checkType + " Not  Available");
			return false;
		}
	
		
	}

