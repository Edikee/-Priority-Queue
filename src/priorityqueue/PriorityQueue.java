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
			if(priorityNumber > 30 || priorityNumber < 0){
				new IllegalArgumentException("priorityNumber must be between 0 and 30");
			}
			hashmap.get(priorityNumber).add(obj);

		}
		return true;
	}

	@Override
	public E getFirst() { // O(log n )
		E value = null;
		synchronized (lock) {

			Object[] keySet = hashmap.keySet().toArray();
			int index = 0;
			boolean ok = false;
			List list = null;
			while (!ok && index < keySet.length) { // get the list with the min
							       // priority					
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
			add(newObj, priorit);
		}
	}

}
