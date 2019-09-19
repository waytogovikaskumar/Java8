package com.javaEightLambda;
//Java Lambda Expression Example: Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample9 {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();  
        
        //Adding Products  
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
        
        Collections.sort(list, (p1, p2) -> {
        	return p1.name.compareTo(p2.name);
        });
        
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  
        
        System.out.println("Sorting on the basis of name using java 8 for each...");  
		
		 list.forEach(p -> { System.out.println(p.id+" "+p.name+" "+p.price); });
		 
	}

}
