package app.Interface;

/**
 * @author Ali
 *
 * @param <T>
 */
public interface DBIFgen<T>{
	
	boolean isEmpty();

	int size();

	void appendLast(T o);

	T removeLast();

	T get(int i);

	void swap(int a, int b);

}
