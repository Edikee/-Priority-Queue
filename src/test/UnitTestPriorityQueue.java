package test;

import priorityqueue.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestPriorityQueue {
	PriorityQueue<String> priorityQueue;

	@Before
	public void setUp() {

		priorityQueue = new PriorityQueue<String>();

		priorityQueue.add("2", 2);
		priorityQueue.add("3", 3);
		priorityQueue.add("4", 4);
		priorityQueue.add("5", 5);

		priorityQueue.add("22", 2);
		priorityQueue.add("33", 3);
		priorityQueue.add("44", 4);
		priorityQueue.add("55", 5);

	}

	@Test
	public void isEmpty_EmptyIsFalse_True() {
		Assert.assertEquals(priorityQueue.isEmpty(), false);
	}

	@Test
	public void getFirst_getFirstIs_2_True() {
		Assert.assertEquals(priorityQueue.getFirst(), "2");

	}

	@Test
	public void getFirst_getFirstIs_2_22_3_33_True() {
		Assert.assertEquals(priorityQueue.getFirst(), "2");
		Assert.assertEquals(priorityQueue.getFirst(), "22");
		Assert.assertEquals(priorityQueue.getFirst(), "3");
		Assert.assertEquals(priorityQueue.getFirst(), "33");
	}

	@Test
	public void remove_remove2_True() {
		Assert.assertEquals(priorityQueue.remove(2, "2"), true);

	}

	@Test
	public void remove_remove222_False() {
		Assert.assertEquals(priorityQueue.remove(2, "222"), false);

	}

	@Test
	public void changePriority_changePriorityTheValue2forNew2_True() {

		priorityQueue.changePriority("2", 2, "new2", 2);
		Assert.assertEquals(priorityQueue.contains("new2"), true);

	}

	@Test
	public void contains_Contains333_False() {

		Assert.assertEquals(priorityQueue.contains("333"), false);

	}

	@Test
	public void contains_Contains55_True() {

		Assert.assertEquals(priorityQueue.contains("55"), true);

	}
}
