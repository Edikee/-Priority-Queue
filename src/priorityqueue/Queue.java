package priorityqueue;

public interface Queue<E> {
	public boolean add(E obj);

	public E getFirst();

	public boolean isEmpty();
}
