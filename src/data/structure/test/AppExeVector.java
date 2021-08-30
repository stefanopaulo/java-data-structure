package data.structure.test;

import data.structure.vector.Vector;

public class AppExeVector {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>(3);
		
		vector.add("A");
		vector.add("B");
		vector.add("C");
		
		boolean contain = vector.contains("A");
		
		if (contain) {
			System.out.println("Elemento existe no vetor.");
		} else {
			System.out.println("Elemento não existe no vetor.");
		}
		
		System.out.println(vector.lastIndexOf());
		
		vector.removeElement(0);
		
		System.out.println(vector.lastIndexOf());
		
		vector.add("D");
		vector.add("E");
		vector.add("F");
		
		System.out.println(vector);
		
		vector.remove("D");
		
		System.out.println(vector);
		
//		vector.remove("Z");
		
		System.out.println(vector.get(3));
		
		vector.clear();
		
		System.out.println(vector);
		
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");
		vector.add("6");
		vector.add("7");
		vector.add("8");
		vector.add("9");
		vector.add("10");
		vector.add("11");
		
		System.out.println(vector);
		
	}

}
