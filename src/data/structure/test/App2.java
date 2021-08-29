package data.structure.test;

import data.structure.model.Contact;
import data.structure.vector.Vector;

public class App2 {

	public static void main(String[] args) {
		
		Vector vector = new Vector(3);

		Contact c1 = new Contact("Contato 1", "1234-5678", "contato1@gmail.com");
		Contact c2 = new Contact("Contato 2", "2345-6789", "contato2@gmail.com");
		Contact c3 = new Contact("Contato 3", "3456-7890", "contato3@gmail.com");
		
		vector.add(c1);
		vector.add(c2);
		vector.add(c3);
		
		System.out.println("Size: " + vector.size());
		System.out.println(vector);
		
	}

}
