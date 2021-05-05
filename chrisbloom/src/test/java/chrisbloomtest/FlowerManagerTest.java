package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.Flower;
import chrisbloom.FlowerManager;

public class FlowerManagerTest {

	@Test
	/**
	 * test case for adding flowers
	 */
	public void test1() {
		
		//test case 1 - with valid inputs
		
		Flower newFlower = new Flower("Natural", "FLORAL GARLAND",800);
		boolean success=FlowerManager.addFlower(newFlower);
		assertEquals(true,success);
		System.out.println("*******************************");
		
		//test case 2 - with invalid category
		
		Flower newFlower2 = new Flower("Nat", "FLORAL GARLAND",800);
		boolean success2=FlowerManager.addFlower(newFlower2);
		assertEquals(false,success2);
		System.out.println("*******************************");
		
		//test case 3 - with empty spaces
		
		Flower newFlower3 = new Flower("Natural", "           ",800);
		boolean success3=FlowerManager.addFlower(newFlower3);
		assertEquals(false,success3);
		System.out.println("*******************************");
		FlowerManager.displayFlowers();
	}
	@Test
	/**
	 * Test case for deleting flowers
	 */
	public void test2() {
		
		//test case 1 - with valid inputs
		
		Flower oldFlower = new Flower("Natural", "FLORAL GARLAND",800);
		boolean success=FlowerManager.deleteFlower(oldFlower);
		assertEquals(true,success);
		System.out.println("*******************************");
		
		//test case 2 - with invalid category
		
		Flower oldFlower2 = new Flower("Nat", "FLORAL GARLAND",1000);
		boolean success2=FlowerManager.deleteFlower(oldFlower2);
		assertEquals(false,success2);
		System.out.println("*******************************");
		
		//test case 3 - with empty spaces
		
		Flower oldFlower3 = new Flower("Natural", "           ",1000);
		boolean success3=FlowerManager.deleteFlower(oldFlower3);
		assertEquals(false,success3);
		System.out.println("*******************************");
		FlowerManager.displayFlowers();
	}
}
