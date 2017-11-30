package priorityqueue;

 
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractQueue<E> implements Queue<E> {
	protected Map<Integer, List<E>> hashmap;

	public AbstractQueue() {
		hashmap = new HashMap<Integer, List<E>>();
		for(int i = 0 ; i < 31;i++){
			hashmap.put(i, new LinkedList<E>());
		}
	}

	public boolean isEmpty() { // O(1)
	 
		for(Integer key : hashmap.keySet()){
			
			if(hashmap.get(key).size()>0){
				return false;
			}
		}
		return true;
	}

}
