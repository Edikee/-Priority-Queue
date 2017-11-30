package priorityqueue;

public interface List<E> {
	public boolean add(E obj);

	public boolean removeIndexOf(int index);

	public boolean remove(E obj);

	public E get(int index);

	public int indexOf(E obj);

	public int size();
}
