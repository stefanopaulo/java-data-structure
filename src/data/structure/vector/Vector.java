package data.structure.vector;

public class Vector<T> {
	private T[] elements;
	private int size;
	
	public Vector(int capacity) {
		this.elements = (T[]) new Object[capacity];
		this.size = 0;
	}
	
	public boolean add(T element) {
		this.increaseVectorCapacity();
		
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		
		return false;
	}
	
	public boolean add(T element, int position) {
		this.increaseVectorCapacity();
		
		if (!(position >= 0 && position < this.size)) {
			throw new IllegalArgumentException("Invalid position!");
		}
		
		for (int i = this.size-1; i >= position; i--) {
			this.elements[i+1] = this.elements[i]; 
		}
		
		this.elements[position] = element;
		this.size++;
		
		return true;
	}
	
	public void removeElement(int position) {
		if (!(position >= 0 && position < this.size)) {
			throw new IllegalArgumentException("Invalid position!");
		}
		
		for (int i = position; i < this.size-1; i++) {
			this.elements[i] = this.elements[i+1]; 
		}
		
		this.size--;
	}
	
	public void remove(T element) {
		boolean contain = this.contains(element);
		
		if (!contain) {
			throw new IllegalArgumentException("Invalid argument!");
		}
		
		int pos = search(element);
		
		removeElement(pos);
	}
	
	public T get(int position) {
		return search(position);
	}
	
	public int size() {
		return this.size;
	}
	
	public T search(int position) {
		if (!(position >= 0 && position < this.size)) {
			throw new IllegalArgumentException("Invalid position!");
		}
		
		return this.elements[position];
	}
	
	public int search(T element) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i].equals(element)) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public boolean contains(T element) {
		return search(element) > -1;
	}
	
	public int lastIndexOf() {
		return this.size - 1;
	}
	
	private void increaseVectorCapacity() {
		if (this.size == this.elements.length) {
			T[] newElements = (T[]) new Object[this.elements.length * 2];
			
			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			
			this.elements = newElements;
		}
	}
	
	public void clear() {
		this.elements = (T[]) new Object[10];
		this.size = 0;
	}
	
	public void showVector() {
		for (T element : this.elements) {
			if (element != null) {
				System.out.println(element);
			}
		}
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for (int i = 0; i < this.size-1; i++) {
			sb.append(this.elements[i]);
			sb.append(", ");
		}
		
		if (this.size > 0) {
			sb.append(this.elements[this.size-1]);
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}
