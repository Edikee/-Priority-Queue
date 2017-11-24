package priorityqueue;

public class PriorityQueue<E> {
	private List<E> list;
	private List<Integer> priority;
	private int priorityMinIndex;
	private int priorityMin;
	public PriorityQueue(){
		list = new List<E>();
		priority = new List<Integer>();
		priorityMinIndex = 0;
		priorityMin = Integer.MAX_VALUE;
		
	} 
	public void add(E obj,Integer priorityNumber){
		
		list.add(obj);
		priority.add(priorityNumber);
		
		if(priorityMin > priorityNumber){
			priorityMinIndex = 0;
			priorityMin = priorityNumber;
		}
		else 
			priorityMinIndex++;
		
		
	}
	public void kiir(){
		System.out.println(priorityMinIndex);
		for(int i=0;i<priority.length;i++){
			System.out.println(list.get(i) + " " + priority.get(i)+ " ");
		}
	 
	}
 
}
