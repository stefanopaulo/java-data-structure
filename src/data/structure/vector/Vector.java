package data.structure.vector;

public class Vector {
	private String[] elements;
	private int size;
	
	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}
	
//	public void add(String element) {
//		for (int i = 0; i < this.elements.length; i++) {
//			if (this.elements[i] == null) {
//				this.elements[i] = element;
//				break;
//			}
//		}
//	}
	
//	public void add(String element) throws Exception {
//		if (this.size < this.elements.length) {
//			this.elements[this.size] = element;
//			this.size++;			
//		} else {
//			throw new Exception("Vector is already filled, it is not possible to add another element.");
//		}
//	}
	
	public boolean add(String element) {
		this.increaseVectorCapacity();
		
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		
		return false;
	}
	
	public boolean add(String element, int position) {
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
	
	public int size() {
		return this.size;
	}
	
	public String search(int position) {
		if (!(position >= 0 && position < this.size)) {
			throw new IllegalArgumentException("Invalid position!");
		}
		
		return this.elements[position];
	}
	
	public int search(String element) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i].equals(element)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private void increaseVectorCapacity() {
		if (this.size == this.elements.length) {
			String[] newElements = new String[this.elements.length * 2];
			
			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			
			this.elements = newElements;
		}
	}
	
	public void showVector() {
		for (String element : this.elements) {
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
