package priorityqueue;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractQueue<E> implements Queue<E> {

	protected Map<Integer, LinkedList<E>> hashMap;
	protected int elementsCount;

	public AbstractQueue(int size) {

		elementsCount = 0;
		hashMap = new HashMap<Integer, LinkedList<E>>();

		for (int i = 0; i < size; i++) {

			hashMap.put(i, new LinkedList<E>());
		}
	}

	public int size() {

		return hashMap.size();

	}

	public void reSize(int newSize) {
		// O(newSize)
		Map<Integer, LinkedList<E>> reSizedMap = new HashMap<Integer, LinkedList<E>>();

		for (int i = 0; i < hashMap.size(); i++) {

			reSizedMap.put(i, hashMap.get(i));
		}

		for (int i = hashMap.size(); i < newSize; i++) {

			reSizedMap.put(i, new LinkedList<E>());
		}

		hashMap = reSizedMap;
	}

	public boolean isEmpty() { // O(1)

		if (elementsCount == 0) {

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
