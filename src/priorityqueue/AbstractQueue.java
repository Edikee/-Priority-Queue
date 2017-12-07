package priorityqueue;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractQueue<E> implements Queue<E> {
	protected Map<Integer, LinkedList<E>> hashMap;

	public AbstractQueue() {
		hashMap = new HashMap<Integer, LinkedList<E>>();

	}

	public boolean isEmpty() { // O(1)

		if (hashMap.isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean contains(E obj) {
		for (Integer index : hashMap.keySet()) {
			if (hashMap.get(index).contains(obj)) {
				return true;
			}
		}
		return false;
	}

}
