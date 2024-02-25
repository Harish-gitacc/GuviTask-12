package guviTask12;

import java.util.ArrayList;

public class ArrayRemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.add("Camel");
		arrayList.add("Horse");
		arrayList.add("Loin");
		arrayList.add("Tiger");
		arrayList.add("Zebra");
		arrayList.add("Lepord");
		
	    System.out.println("ArrayList before removing elements:"+arrayList);
	    arrayList.clear();
	     System.out.println("ArrayList after removing elements:"+arrayList);

	}

}

OUTPUT:
ArrayList before removing elements:[Camel, Horse, Loin, Tiger, Zebra, Lepord]
ArrayList after removing elements:[]
