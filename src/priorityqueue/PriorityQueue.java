package priorityqueue;

import java.util.HashMap;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PriorityQueue<E> extends AbstractQueue<E> {

	private Object lock = new Object();

	public PriorityQueue() {
		super();

	}

	@Override
	public boolean add(E obj) { // O(1)

		return add(obj, 1);
	}

	public boolean add(E obj, Integer priorityNumber) { // O(1)

		synchronized (lock) {
			List tmpList = hashmap.get(priorityNumber);
			if (tmpList != null) {
				hashmap.get(priorityNumber).add(obj);
			} else {
				List newList = new LinkedList<E>();
				newList.add(obj);
				hashmap.put(priorityNumber, newList);
			}
		}
		return true;
	}

	@Override
	public E getFirst() { // O(log n )
		E value = null;

		int index = 0;
		boolean ok = false;
		List list = null;

		synchronized (lock) {
			Object[] keySet = hashmap.keySet().toArray();
			while (!ok && index < keySet.length) {

				list = hashmap.get(keySet[index]);
				if (list.size() > 0) {
					ok = true;
				} else {
					index++;
				}
			}

			value = (E) list.get(list.size() - 1); // get the last object
			list.remove(value); // remove the object from the list
		}

		return value;

	}

	public void changePriority(E oldObj, E newObj, int priorit) { // O(1)

		synchronized (lock) {
			for (Integer key : hashmap.keySet()) {

				if (hashmap.get(key).size() > 0 && hashmap.get(key).remove(oldObj)) {
					break;
				}
			}
		}
		add(newObj, priorit);

	}

}
