package test;
import priorityqueue.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestPriorityQueue {
	
	@Test
	public void isEmpty_EmptyIsTrue_True() {
		PriorityQueue pq = new PriorityQueue();
		Assert.assertEquals(pq.isEmpty(),true);
	}
	@Test
	public void isEmpty_EmptyIsFalse_True() {
		FakePriorityQueue fpq = new FakePriorityQueue();
		Assert.assertEquals(fpq.isEmpty(),false);
	}
	@Test
	public void getMin_getMinisFakeNode5_True() {
		FakePriorityQueue fpq = new FakePriorityQueue();
		Node fn = fpq.getMin();
		Node fnn = fpq.getMin();
		Assert.assertEquals(fn.getContain(),6);
		Assert.assertEquals(fnn.getContain(),5);
 
		
	}
	 
}
