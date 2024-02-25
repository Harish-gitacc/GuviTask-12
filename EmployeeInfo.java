package guviTask12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>EmpInfo=new TreeMap<>();
		EmpInfo.put(1, "Hari");
		EmpInfo.put(2, "Anand");
		EmpInfo.put(3, "Ravi");
		EmpInfo.put(4, "Siva");
		EmpInfo.put(5, "Billa");
		EmpInfo.put(6, "Vijay");
		
		
		List<String>Names=new ArrayList<>(EmpInfo.values());
		Collections.sort(Names);
		System.out.println("Name of the employe in order"+EmpInfo);
		
		for(String name:Names)
		{
			System.out.println(name);
		}
	}

}


OUTPUT:
Name of the employe in order{1=Hari, 2=Anand, 3=Ravi, 4=Siva, 5=Billa, 6=Vijay}
Anand
Billa
Hari
Ravi
Siva
Vijay

