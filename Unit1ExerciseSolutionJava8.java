package com.java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
      
		List<Person> peaple =  Arrays.asList(new Person("Vikas", "Kumar", 28),
				new Person("Kumar", "Vikas", 28),
				new Person("Akash", "Singh", 28),
				new Person("Piyush", "Sharma", 28),
				new Person("Shashi", "Verma", 28)
				);
		
		//Step 1  sort the list based on lastname
		
		Collections.sort(peaple, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		Collections.sort(peaple, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//Step 2 create the method that print all elemnets in the list
		printAll(peaple);
		
		//Step 3 Create a method that prints all peaple that have last name begining with V
		printsLastNameBeginWithV (peaple);
	}

	private static void printsLastNameBeginWithV(List<Person> peaple) {
      	for (Person person : peaple) {
			if(person.getLastName().startsWith("V")) {
				System.out.println(person);
				
			}
		}	
	}

	

	private static void printAll(List<Person> peaple) {
		for (Person person : peaple) {
			System.out.println(person);
		}
		
	}

}
