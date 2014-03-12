package unittests;


import dynamicprogramming.Knapsack;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Dinal
 */

public class KnapsackTest {

	private Knapsack ks;

	@Before
	public void setUp() throws Exception {
		ks = new Knapsack();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int knapsack = ks.knapsack(new int[]{2,7,1,14}, new int[]{2,5,7,3},  16);
		assertEquals(22, knapsack);
	}
	@Test
	public void test2() {
		int knapsack = ks.knapsack(new int[]{0,2,3,8}, new int[]{0,3,5,7},  20);
		assertEquals(13, knapsack);
	}
	@Test
	public void test3() {
		int knapsack = ks.knapsack(new int[]{0,3,4,4,1,7}, new int[]{0,3,2,5,2,6},  5);
		assertEquals(7, knapsack);
	}
	@Test
	public void test4() {
		int knapsack = ks.knapsack(new int[]{0,3,4,4,1,7}, new int[]{0,3,2,5,2,6},  10);
		assertEquals(12, knapsack);
	}

}
