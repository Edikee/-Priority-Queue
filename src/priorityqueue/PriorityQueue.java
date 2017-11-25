package priorityqueue;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PriorityQueue<E> extends Queue<E> {

	protected LinkedList<Integer> priority;
	private Integer priorityMinIndex;
	private int priorityMin;

	public PriorityQueue() {
		super();
		priority = new LinkedList<Integer>();
		priorityMinIndex = 0;
		priorityMin = Integer.MAX_VALUE;

	}

	public synchronized boolean add(E obj, Integer priorityNumber) { // O(1)

		list.add(obj);
		priority.add(priorityNumber);

		if (priorityMin > priorityNumber) {
			priorityMinIndex = 0;
			priorityMin = priorityNumber;
		} else
			priorityMinIndex++;

		return true;
	}

	public synchronized E getMin() { // O(n)

		E value = list.get(priorityMinIndex);

		list.remove(value);
		priority.removeIndexOf(priorityMinIndex);

		searchMin();

		return value;
	}

	private synchronized void searchMin() { // O(n)
		priorityMin = Integer.MAX_VALUE;

		for (int i = 0; i < priority.size(); i++) {
			Integer tmp = priority.get(i);

			if (priorityMin >= tmp) {
				priorityMin = tmp;
				priorityMinIndex = i;
			}

		}

	}

	public synchronized void changePriority(E oldObj, E newObj, int priorit) { // O(n)
		int index = list.indexOf(oldObj);
		if (list.remove(oldObj)) {
			priority.removeIndexOf(index);
			searchMin();
			this.add(newObj, priorit);
		}
	}

}
