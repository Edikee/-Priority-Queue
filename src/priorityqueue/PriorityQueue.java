package priorityqueue;

import java.util.ArrayList;

import javax.sound.midi.MidiChannel;

public class PriorityQueue<E> extends AbstractQueue<E> {

	private Object lock = new Object();

	@Override
	public boolean add(E obj) {

		return add(obj, 1);
	}

	public boolean add(E obj, Integer priorityNumber) { // O(log n )

		synchronized (lock) {

			ArrayList<E> list = map.get(priorityNumber);

			if (list == null) {
				list = new ArrayList<E>();
				map.put(priorityNumber, list);

			}

			list.add(obj);

		}

		return true;

	}

	@Override
	public E getFirst() { // O(1)

		E first = null;
		ArrayList<E> list = null;
		int minPriority;

		synchronized (lock) {

			Object[] keySet = map.keySet().toArray();
			minPriority = (int) keySet[0];
			first = map.get(minPriority).get(0);
			remove(minPriority, first);

		}

		return first;

	}

	public void remove(int priority, E obj) { // O(1)

		ArrayList<E> list = null;

		synchronized (lock) {

			list = map.get(priority);
			list.remove(obj);

			if (list.size() == 0) { // if the list is empty
									// remove the key
				map.remove(priority);
			}
		}
	}

	public void changePriority(E oldObj, int oldPriority, E newObj, int newPriorit) {
		// O(log n)
		remove(oldPriority, oldObj);

		add(newObj, newPriorit);

	}

}
