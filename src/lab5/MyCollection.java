package lab5;

import java.util.Iterator;

public interface MyCollection<E>{
	int size();
	boolean isEmpty();
	boolean contains(Object o);
	boolean add(Object o);
	boolean remove(Object o);
	Iterator<E> iterator();
}
