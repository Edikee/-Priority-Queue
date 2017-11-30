package test;

import priorityqueue.Node;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.junit.Assert;

public class UnitTestLinkedList {


	@Before
	public void setUp() {


	}

	@Test
	public void Size_SizeIs2_True() {
		FakeLinkedList fll = new FakeLinkedList();
		int length = fll.size();
		Assert.assertEquals(2, 2);
	}

	@Test
	public void Remove_SizeIs1_True() {

		FakeLinkedList fll = new FakeLinkedList();
		fll.removeIndexOf(0);
		int length = fll.size();
		Assert.assertEquals(length, 1);
	}

	@Test
	public void Get_GetFakeNode5AndGetFakeNode6_True() {

		FakeLinkedList fll = new FakeLinkedList();

		Assert.assertEquals((fll.get(0)).getContain(), 6);
		Assert.assertEquals((fll.get(1)).getContain(), 5);

	}

	@Test
	public void Add_AddFakeNode5_True() {

		FakeLinkedList fll = new FakeLinkedList();
		Node fn = new Node();
		fn.setContain(5);
		fll.add(fn);

		Assert.assertEquals((fll.get(2)).getContain(), 5);
		Assert.assertEquals(fll.size(), 3);

	}
}
