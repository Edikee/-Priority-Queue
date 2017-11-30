package priorityqueue;

public interface Queue<E> {
	public boolean add(E obj, Integer priorityNumber);

	public E getFirst();

	void searchMin();

	public void changePriority(E oldObj, E newObj, int priorit);

	public boolean isEmpty();
}
