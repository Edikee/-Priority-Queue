package priorityqueue;

public class List {
	private Node head;
	private int length;
	public List(){
		head = new Node();
		head.setNext(null);
		head.setContain(null);
		length = -1;
	}
	public void add(Object obj){
		if(length == -1){
			head.setContain(obj);    //first element
		}
		else{
			Node curent = head;		
			while(curent.getNext()!=null){
				curent = curent.getNext();
			}
			Node next = new Node();
			next.setContain(obj);
			next.setNext(null);
			curent.setNext(next);
		}
		length++;
	}
	public void remove(Object obj){
		Node curent = head;		
		Node previous = null;
		boolean found = false;
		if(head.getContain().equals(obj)){
			head = head.getNext();
			length--;
		}
		else{
			while(!found  && curent.getNext()!= null){
				if(curent.getContain().equals(obj))
					found = true;
				else{
					previous = curent;
					curent = curent.getNext();
				}
			}
			if(found | curent.getContain().equals(obj)){
				previous.setNext(curent.getNext());
				length--;
			}
		}
	}
	public Object get(int index){
		Node curent = head;	
		if(length < index){
			throw new IndexOutOfBoundsException();
		}
		while(index != 0){
			curent = curent.getNext();
			index --;
		}
		return curent.getContain();
	}
	public int size(){
		return length;
	}
	public void kiir(){
		Node curent = head;	
		while(curent.getNext()!=null){
			System.out.println(curent.getContain());
			curent = curent.getNext();
		}
		System.out.println(curent.getContain());
	}
}
