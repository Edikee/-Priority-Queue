package priorityqueue;

public class Node {
	
	private Object contain;
	private Node next;
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public void setContain(Object contain){
		this.contain = contain;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Object getContain(){
		return contain;
	}

	
}
