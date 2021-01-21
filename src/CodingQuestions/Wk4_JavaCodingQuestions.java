package CodingQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Wk4_JavaCodingQuestions {

	public static void main(String[] args) {
		
		//Q1: ArrayList of String called employeeNames. //Q4: Add min five names
		List <String> employeeNames = new ArrayList<String>(); 
		employeeNames.add("Jacob");
		employeeNames.add("Davin");
		employeeNames.add("Shelby");
		employeeNames.add("Peter");
		employeeNames.add("Franco");	
		

		
		//Q2: HashSet of Integer called ids. //Q4: Add min five ids
		Set<Integer> ids = new HashSet<Integer>(); 
		ids.add(17421);
		ids.add(28800);
		ids.add(38123);
		ids.add(46982);
		ids.add(57643);		

		
		System.out.println("Create enhance loop to populate employeeMap using the key from the hashSet ids and Value from ArrayList employeeNames");
		//Q5: Create enhance loop to populate employeeMap using the key from the hashSet ids and Value from ArrayList employeeNames
		Map<Integer, String> employeeMap = new HashMap<Integer, String>(); //Q3: HashMap of Integer, String called employeeMap
		int i = 0;
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
			System.out.println(employeeMap);
					
		}
		
		//Q6: using employee.Map.keySet() to print the current key and associated value to the console
		System.out.println("--------------------------------------------------------");
		System.out.println("Using keySet to print current key and associated value");
		Set<Integer> employeeKeys = employeeMap.keySet();
			for (Integer key : employeeKeys) {
			System.out.println(key + " : " + employeeMap.get(key));	
		
		}
		
		//Q7-9: Using StringBuilder to add " -" after ids
		System.out.println("--------------------------------------------------------");
		System.out.println("Using StringBuilder to append a dash after ids");
	
		StringBuilder idsBuilder = new StringBuilder(); 
		for (Integer id : ids) {
			idsBuilder.append(id + " - ");
			System.out.println(idsBuilder);
		}		
		
		//Q10-11: Using StringBuilder to append a " " after employeeNames
		System.out.println("--------------------------------------------------------");
		System.out.println("Using StringBuilder to append a space after employeeNames");
		
		StringBuilder namesBuilder = new StringBuilder();
		namesBuilder.append(employeeNames.get(0));
		for (int y = 1; y < employeeNames.size(); y++ ) {
			namesBuilder.append(" ").append(employeeNames.get(y));
		}
		String results = namesBuilder.toString();
		System.out.println(" " + results);
		
	}
}	
		

