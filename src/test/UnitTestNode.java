package test;

import priorityqueue.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestNode {
	@Test
	public void GetContain_ContainIs5_True() {
		Node fakeNode = new Node();
		fakeNode.setContain(5);
		Assert.assertEquals(fakeNode.getContain(), 5);
	}

	@Test
	public void GetNext_NextIsNull_Node_True() {

		Node fakeNode = new Node();
		fakeNode.setContain(5);
		Assert.assertEquals(fakeNode.getNext(), null);
	}

	@Test
	public void GetNext_NextIsFakeNode5_Node_True() {

		Node fakeNode5 = new Node();
		Node fakeNode6 = new Node();
		fakeNode5.setContain(5);
		fakeNode6.setContain(6);
		fakeNode5.setNext(fakeNode6);
		Assert.assertEquals(fakeNode5.getNext(), fakeNode6);
	}
}
