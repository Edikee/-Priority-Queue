package priorityqueue;

public class PriorityQueue<E> extends AbstractQueue<E> {

	private Object lock = new Object();
	private int minIndex;

	public PriorityQueue() {
		super();
		minIndex = Integer.MAX_VALUE;
	}

	public void searchMinIndex() { // O(log n )
		List<E> list = null;
		boolean ok = false;

		int index = 0;
		synchronized (lock) {

			Object[] keySet = hashmap.keySet().toArray();
			while (!ok && index < keySet.length) {

				list = hashmap.get(keySet[index]);
				if (list.size() > 0) {
					minIndex = (int) keySet[index];
					ok = true;
				} else {
					index++;
				}

			}
		}
	}

	@Override
	public boolean add(E obj) { // O(1)

		return add(obj, 1);
	}

	public boolean add(E obj, Integer priorityNumber) { // O(1)

		synchronized (lock) {

			List<?> tmpList = hashmap.get(priorityNumber);
			if (tmpList != null) {

				hashmap.get(priorityNumber).add(obj);

			} else {

				List<E> newList = new LinkedList<E>();
				newList.add(obj);
				hashmap.put(priorityNumber, newList);

			}
			if (priorityNumber < minIndex) {

				minIndex = priorityNumber;
			}
		}

		return true;
	}

	@Override
	public E getFirst() { // O(log n )
		E value = null;

		List<E> list = null;

		synchronized (lock) {

			list = hashmap.get(minIndex);
			value = (E) list.get(list.size() - 1); // get the last object
			list.remove(value); // remove the object from the list

			if (list.size() == 0) {

				searchMinIndex();
			}
		}

		return value;

	}

	public void changePriority(E oldObj, int oldpriority, E newObj, int newpriorit) { // O(log
																						// n)

		synchronized (lock) {

			hashmap.get(oldpriority).remove(oldObj);

			if (hashmap.get(oldpriority).size() == 0 && newpriorit > minIndex) {

				searchMinIndex();
			}
		}
		add(newObj, newpriorit);

	}

}
