package priorityqueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractQueue<E> implements Queue<E> {
	protected Map<Integer, ArrayList<E>> map;

	public AbstractQueue() {
		map = new TreeMap<Integer, ArrayList<E>>();

	}

	public boolean isEmpty() { // O(1)

		if (map.isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean contains(E obj) {
		for (Integer index : map.keySet()) {
			if (map.get(index).contains(obj)) {
				return true;
			}
		}
		return false;
	}

}
