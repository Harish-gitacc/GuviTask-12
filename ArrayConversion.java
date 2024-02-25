package guviTask12;

import java.util.ArrayList;
import java.util.List;

public class ArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> list=new ArrayList<>();
      list.add("SBI");
      list.add("Indian Bank");
      list.add("Bandan Bank");
      list.add("ICICI");
      
      
      String[] array= new String[list.size()];
      array=list.toArray(array);
      System.out.println("The converted Array list are:");
      for(String item:array)
      {
    	 System.out.println(list); 
      }
	}
	

}


OUTPUT:
The converted Array list are:
[SBI, Indian Bank, Bandan Bank, ICICI]
[SBI, Indian Bank, Bandan Bank, ICICI]
[SBI, Indian Bank, Bandan Bank, ICICI]
[SBI, Indian Bank, Bandan Bank, ICICI]
