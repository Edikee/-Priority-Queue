package test;
import priorityqueue.*;
public class FakePriorityQueue  extends PriorityQueue<Node>{
	public FakePriorityQueue(){
		this.list = new FakeLinkedList();
		this.priority =  new LinkedList<Integer>();
		priority.add(4);
		priority.add(3);
		
	}

}
