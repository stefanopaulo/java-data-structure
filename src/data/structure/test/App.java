package data.structure.test;

import data.structure.vector.Vector;

public class App {

	public static void main(String[] args) {
		Vector vector = new Vector(10);

		vector.add("Element 1");
		vector.add("Element 2");
		vector.add("Element 3");
		
		System.out.println("Size: " + vector.size());
		System.out.println();
		
		vector.showVector();
		System.out.println();
		
		System.out.println(vector);
		System.out.println();
		
		System.out.println(vector.search(3));
	}

}
