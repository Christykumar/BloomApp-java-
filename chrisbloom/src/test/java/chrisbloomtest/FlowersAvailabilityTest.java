package chrisbloomtest;

import static org.junit.Assert.*;


import org.junit.Test;

import chrisbloom.FlowerAvailability;

public class FlowersAvailabilityTest {

	@Test
	public void test1() {
		//Test case1 - Correct inputs in category natural
		
				String category="Natural";
				String flowerType="Flowers";
				boolean valid=FlowerAvailability.selectCategory(category, flowerType);
				assertEquals(true,valid);
	}
	
	@Test
	public void test2(){
		
				
				//Test case2- Correct inputs in category artificial
		
			    String category1="Artificial";
			    String flowerType1="Floral Boquets";
			    boolean valid1=FlowerAvailability.selectCategory(category1,flowerType1);
			    assertEquals(true,valid1);
			
	}
	
	@Test
	public void test3() {
		
				
				//Test case 3- With wrong category and correct flower type
		
			    String category2="christina";
			    String flowerType2="Floral Boquets";
			    boolean valid2=FlowerAvailability.selectCategory(category2,flowerType2);
			    assertEquals(false,valid2);
	}
	@Test
	public void test4(){
				
				//Test case 3- correct category and wrong flower type
		
			    String category3="natural";
			    String flowerType3="garland";
			    boolean valid3=FlowerAvailability.selectCategory(category3,flowerType3);
			    assertEquals(false,valid3);
		
	}

}
