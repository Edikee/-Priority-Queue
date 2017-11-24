package priorityqueue;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PriorityQueue<E> {
	private List<E> list;
	private List<Integer> priority;
	private Integer priorityMinIndex;
	private int priorityMin;
	public boolean lock;
	
	public PriorityQueue(){
		list = new List<E>();
		priority = new List<Integer>();
		priorityMinIndex = 0;
		priorityMin = 50;
		
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
	public E getMin(){
		E value = list.get(priorityMinIndex);
		list.remove(value);
		priority.removeIndexOf(priorityMinIndex);
	 
		searchMin();
		return value;
	}	
	
	private void searchMin(){
		priorityMin = 50;
		Integer tmp =  priority.get(0);
		for(int i=0 ; i< priority.length ; i++){
			tmp = priority.get(i);
		
			if(priorityMin >= tmp){
				priorityMin = tmp;
				priorityMinIndex = i;
			}
			
		}
//		System.out.println(priorityMinIndex);
	 
	}
	
	public void changePriority(E obj,int priorit){
		if(list.remove(obj)){
			priority.remove(priorityMin);
			searchMin();
			this.add(obj, priorit);
		}
	}
	
	public void kiir(){
 
		for(int i=0;i<list.length;i++){
			System.out.println(list.get(i) + " " + priority.get(i)+ " ");
		}
	 
	}
 
}


