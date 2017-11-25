package priorityqueue;

public class Queue<E> {
	protected LinkedList<E> list;
	
	public Queue(){
		list = new LinkedList<E>();
	}
	public boolean isEmpty(){
		
		if(list.size()>0)
			return false;
		return true;
	}
}
