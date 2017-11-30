package priorityqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractQueue<E> implements Queue<E> {
	protected Map<Integer, List<E>> hashmap;

	public AbstractQueue() {
		hashmap = new TreeMap<Integer, List<E>>();

	}

	public boolean isEmpty() { // O(1)

		for (Integer key : hashmap.keySet()) {

			if (hashmap.get(key).size() > 0) {
				return false;
			}
		}
		return true;
	}

}
