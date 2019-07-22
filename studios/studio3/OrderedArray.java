package studio3;

public class OrderedArray<T extends Comparable<T>> implements PriorityQueue<T> {

	public T[] array;
	private int size;
	private int max;
	
	@SuppressWarnings("unchecked")
	public OrderedArray(int maxSize) {
		array = (T[]) new Comparable[maxSize];
		size = 0;
		this.max = maxSize;
	}
	
	@Override
	public boolean isEmpty() {
		//
		// FIXME
		//
		return size == 0;
	}

	@Override
	public void insert(T thing) {
		//
		// FIXME
		//
		if (this.size == this.max) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int count = 0;
//		while (count < size){
//			if (thing.compareTo(array[count]) < 0) {
//				break;
//			}
//			else {
//				count ++;
//			}
//		}
		for (int i=0; i<size; i++) {
			if (thing.compareTo(array[i]) > 0) {
				count = i + 1;
			}
		}
		
		for (int i=this.size; i>count; i--) {
			array[i] = array[i-1];
		}
		array[count] = thing;
		this.size ++;
	}
	
	@Override
	public T extractMin() {
		//
		// FIXME
		//
		if (this.size == 0) {
			return null;
		}
		T remove = array[0];
		for (int i=1; i<this.size; i++) {
			array[i-1] = array[i];
		}
		array[this.size-1] = null;
		size --;
		return remove;
	}

}
