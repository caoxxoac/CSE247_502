package studio3;

import java.util.LinkedList;
import java.util.List;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public LinkedList<T> list;
	
	public UnorderedList() {
		list = new LinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		//
		// FIXME
		//
		return list.isEmpty();
	}

	@Override
	public void insert(T thing) {
		//
		// FIXME
		//
		list.add(thing);
	}

	@Override
	public T extractMin() {
		//
		// FIXME
		//
		if (isEmpty()) {
			return null;
		}
		T min = list.get(0);
		for (int i=0; i<list.size(); i++) {
			T current = list.get(i);
			if (current.compareTo(min) < 0) {
				min = current;
			}
		}
		
		
		list.remove(min);
		return min;
	}

}
