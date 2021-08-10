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
	
	public void showVector() {
		for (String element : this.elements) {
			System.out.println(element);
		}
	}
}
