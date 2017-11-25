package test;

import priorityqueue.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestNode {
	@Test
	public void GetContain_ContainIs5_True() {
		Node fakeNode = new FakeNode5();
		Assert.assertEquals(fakeNode.getContain(), 5);
	}

	@Test
	public void GetNext_NextIsNull_Node_True() {

		Node fakeNode = new FakeNode5();
		Assert.assertEquals(fakeNode.getNext(), null);
	}

	@Test
	public void GetNext_NextIsFakeNode5_Node_True() {

		Node fakeNode5 = new FakeNode5();
		Node fakeNode6 = new FakeNode6();
		fakeNode5.setNext(fakeNode6);
		Assert.assertEquals(fakeNode5.getNext(), fakeNode6);
	}
}
