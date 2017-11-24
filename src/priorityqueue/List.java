package priorityqueue;

public class List<E> {
	private Node<E>head;
	public int length;
	public List(){
		head = new Node<E>();
		head.setNext(null);
		head.setContain(null);
		length = -1;
	}
	public void add(E obj){
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
	public boolean remove(E obj){
		Node<E> curent = head;		
		Node<E> previous = null;
	 
		if(head.getContain().equals(obj)){
			head = head.getNext();
			length--;
			return true;
		}
		else{
			for(int i=0;i<=this.length;i++){
				if(curent.getContain().equals(obj)){
					previous.setNext(curent.getNext());
					length--;
					return true;
					}
				previous = curent;
				curent = curent.getNext();
				 
			}
		}
		return false;
	}
	public E get(int index){
		
		Node<E> curent = head;	
		
		if(length < index || index < 0){
			throw new IndexOutOfBoundsException();
		}
		
		while(index != 0){
			curent = curent.getNext();
			index --;
		}
		
		return curent.getContain();
	}
	public int get(E obj){
		Node<E> curent = head;		
		for(int i=0;i<=this.length;i++){
		
			if(curent.getContain().equals(obj))
				return i;
			curent = curent.getNext();
		}
		return -1;
 
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
