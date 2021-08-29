package data.structure.test;

import java.util.ArrayList;

public class App3 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean exists = arrayList.contains("A");
		
		if (exists) {
			System.out.println("Elemento existe no array.");
		} else {
			System.out.println("Elemento não existe no array.");
		}
		
		int pos = arrayList.indexOf("D");
		
		if (pos > -1) {
			System.out.println("Elemento existe no array.");
		} else {
			System.out.println("Elemento não existe no array.");
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
	}

}
