package test;

import priorityqueue.*;

public class FakeLinkedList extends LinkedList<Node> {
	public FakeLinkedList() {
		Node fn5 = new FakeNode5();
		Node fn6 = new FakeNode6();
		this.add(fn5);
		this.add(fn6);
	}
}
