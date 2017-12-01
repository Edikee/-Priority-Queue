package test;

import priorityqueue.*;

public class FakePriorityQueue extends PriorityQueue<Node> {
	public FakePriorityQueue() {
		super();
		Node a, b;
		a = new Node();
		a.setContain(6);
		b = new Node();
		b.setContain(5);
		System.out.println(add(a,6));
		add(b, 6);
		System.out.println("added");
	}

}
