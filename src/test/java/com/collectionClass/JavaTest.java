package com.collectionClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JavaTest {

/*   	List<String> myArrayList = new ArrayList<String>();
   	@Before
	public void setup   () {
		myArrayList.add("Chrome");
		myArrayList.add("FireFox");
		myArrayList.add("IE");
		myArrayList.add("Safari");
		myArrayList.add("Chrome");
		for(int i=0; i<myArrayList.size(); i++) {
		System.out.println(myArrayList.get(i));
		
		
		
        System.out.println(myArrayList.size()); // size of array list
	    System.out.println(myArrayList.get(2));
	    System.out.println("My second value is IE");
	    
		}}
		
		
	    @Test
		public void funWithJavaStrings() {		
			
			String companyName = "Dom & Tom Inc.";
			// Assert that the word 'Dom' is present in companyName string
			
			String name1 = "Netflix";
			String name2 = "NETFLIX";
			// Assert that name1 equals name2 regardless of case and leading/trailing spaces
			String obj= new String("Netflix");
			System.out.println(obj);
			System.out.println(obj.concat("NETFLIX"));
	    
			int x;
			int y;
			int z;
			String intValue1 = "100";
			String intValue2 = "20";
			// Convert the above 2 strings to integer values and display the sum
			Scanner in = new Scanner (System.in);
			x= 100;
			y = 20;
			z = x+y;
			System.out.println("The result of 100 + 20 = "+ z);
			}


         @Test
	     public void funWithHashMaps() {
		
		HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();

		myHashMap.put(1, "XP");
     	myHashMap.put(2,"WIN7"); 
      	myHashMap.put(3,"WIN8");   
      	System.out.println(myHashMap.size());
      	System.out.println(myHashMap.get(2)); 
      	
		for(Entry m : myHashMap.entrySet()) {
		System.out.println(m.getKey()+ ""+ m.getValue());
		
		System.out.println(myHashMap);
		myHashMap.remove(3);
		System.out.println(myHashMap);
		
         }}
		*/
		 @Test
	     public void Hashmaps() {

		   HashSet<String>  myHashset= new HashSet<String>();
		   myHashset.add("XP");
		   myHashset.add("WIN7");
		   myHashset.add("WIN8");
		   myHashset.add("SAFARI");
		   myHashset.add("XP");
		
		   Iterator<String> it = myHashset.iterator();
		   while(it.hasNext()) {
		   System.out.println(it.next());
		   
		   
			System.out.println(myHashset);
			myHashset.remove(0);
			System.out.println(myHashset);
			
			
			Iterator iterator =myHashset.iterator();
			while (iterator.hasNext()) {
			System.out.println("value: "+iterator.next() + " ");
			}
			
		   }
		   
		   
		   
	    
		
		

           }}
      	
		
		
		
		
		