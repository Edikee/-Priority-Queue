package test;

import priorityqueue.*;

public class FakeLinkedList extends LinkedList<Node> {
	public FakeLinkedList() {
		Node fn5 = new Node();
		fn5.setContain(5);
		Node fn6 = new Node();
		fn6.setContain(6);
		this.add(fn5);
		this.add(fn6);
	}
}
