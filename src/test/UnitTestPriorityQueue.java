package test;

import priorityqueue.*;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestPriorityQueue {
	PriorityQueue<String> priorityQueue;
	LinkedList<Integer> priorityList;

	@Before
	public void setUp() {

		priorityQueue = new PriorityQueue<String>();

		// add(E obj, Integer priorityNumber)
		priorityQueue.add("2", 2);
		priorityQueue.add("22", 2);

		priorityQueue.add("3", 3);
		priorityQueue.add("33", 3);

		priorityQueue.add("4", 4);
		priorityQueue.add("44", 4);

		priorityQueue.add("5", 5);
		priorityQueue.add("55", 5);

		priorityList = new LinkedList<Integer>();

		for (int i = 0; i < 10; i = i + 2) {
			priorityList.addLast(i);

		}

	}

	@Test
	public void isEmpty_EmptyIsFalse_True() {
		Assert.assertEquals(priorityQueue.isEmpty(), false);
	}

	@Test
	public void getFirst_getFirstIs2_True() {
		Assert.assertEquals(priorityQueue.getFirst(), "2");

	}

	@Test
	public void getFirst_getFirstIs2Then22_True() {
		Assert.assertEquals(priorityQueue.getFirst(), "2");
		Assert.assertEquals(priorityQueue.getFirst(), "22");
	}

	@Test
	public void getFirst_getFirstIs2Then22Then33_True() {
		Assert.assertEquals(priorityQueue.getFirst(), "2");
		Assert.assertEquals(priorityQueue.getFirst(), "22");
		Assert.assertEquals(priorityQueue.getFirst(), "3");
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
	public void changePriority_Change3To34_True() {
		// changePriority(E oldObj, int oldPriority, E newObj, int newPriorit)
		priorityQueue.changePriority("3", 3, "34", 3);
		Assert.assertEquals(priorityQueue.contains("34"), true);
		Assert.assertEquals(priorityQueue.contains("3"), false);
	}

	@Test
	public void contains_Contains333_False() {

		Assert.assertEquals(priorityQueue.contains("333"), false);

	}

	@Test
	public void contains_Contains55_True() {

		Assert.assertEquals(priorityQueue.contains("55"), true);

	}

	@Test
	public void binaryAdd_Add5_True() {

		Assert.assertEquals(priorityList.contains(5), false);
		Assert.assertEquals(priorityQueue.binaryAdd(5, priorityList), true);
		Assert.assertEquals(priorityList.contains(5), true);
	}

	@Test
	public void binaryAdd_Add4_False() {

		Assert.assertEquals(priorityList.contains(4), true);
		Assert.assertEquals(priorityQueue.binaryAdd(4, priorityList), false);

	}

	@Test
	public void binaryRemove_Remove2_True() {

		Assert.assertEquals(priorityList.contains(2), true);
		Assert.assertEquals(priorityQueue.binaryRemove(2, priorityList), true);
		Assert.assertEquals(priorityList.contains(2), false);

	}

	@Test
	public void binaryRemove_Remove3_False() {

		Assert.assertEquals(priorityList.contains(3), false);
		Assert.assertEquals(priorityQueue.binaryRemove(3, priorityList), false);
	}

	@Test
	public void changePriorityAndgetFirst_getFirstIs2Then1_True() {
		Assert.assertEquals(priorityQueue.getFirst(), "2");
		// changePriority(E oldObj, int oldPriority, E newObj, int newPriorit)
		priorityQueue.changePriority("33", 3, "33", 1);
		Assert.assertEquals(priorityQueue.getFirst(), "33");
	}
}
