package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.FlowerManager;

public class FlowersCountTest {

	@Test
	public void test1() {
		
		   //Says the count of the flower types(natural)
	
			FlowerManager.displayFlowers();
			String category="Natural";
			int s=FlowerManager.countFlowers(category);
			System.out.println("no of floral types avalilable "+s+" in natural");
			assertEquals(s,3);
			System.out.println("*********************************************");
		}
	@Test
	public void test2() {
		
		   //Says the count of the flower types(artificial)
		
			FlowerManager.displayFlowers();
			String category="artificial";
			int s=FlowerManager.countFlowers(category);
			System.out.println("no of floral types avalilable "+s+" in artificial");
			assertEquals(s,3);
			System.out.println("*********************************************");
		}
	@Test
	public void test3() {
		
		   //Says the count of the flower types(artificial)
		
			FlowerManager.displayFlowers();
			String category="all";
			int s=FlowerManager.countFlowers(category);
			System.out.println("no of floral types avalilable "+s+" as a whole");
			assertEquals(s,6);
			System.out.println("*********************************************");
		}

	}


