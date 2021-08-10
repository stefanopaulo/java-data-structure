package data.structure.test;

import data.structure.vector.Vector;

public class App {

	public static void main(String[] args) {
		Vector vector = new Vector(2);

		vector.add("Elemento 1");
		vector.add("Elemento 2");
		vector.add("Elemento 3");
		
		vector.showVector();
	}

}
