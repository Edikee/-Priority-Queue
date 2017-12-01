package test;

import priorityqueue.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestPriorityQueue {

 
	@Test
	public void isEmpty_EmptyIsFalse_True() {
		FakePriorityQueue fpq = new FakePriorityQueue();
		Assert.assertEquals(fpq.isEmpty(), false);
	}

	@Test
	public void getFirst_getMinisFakeNode5_True() {
		
		FakePriorityQueue fpq = new FakePriorityQueue();
		Node fn = fpq.getFirst();
		 
		Assert.assertEquals(fn.getContain(), 6);

	}

}
