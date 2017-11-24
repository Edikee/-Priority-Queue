package priorityqueue;

public class List {
	private Node head;
	private int length;
	public List(){
		head = new Node();
		head.setNext(null);
		head.setContain(null);
	}
	public void add(Object obj){
		if(length==0){
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
	public boolean remove(Object obj){
		return true;
	}
	public Object get(int index){
		return head.getContain(); //ezt majd kiegesziteni!
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
