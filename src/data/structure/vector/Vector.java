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
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		
		return false;
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
