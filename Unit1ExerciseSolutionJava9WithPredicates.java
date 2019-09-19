package com.java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava9WithPredicates {

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
		System.out.println("Printing All Persons");
		printConditionally(peaple, person -> true);
		
		
		//Step 3 Create a method that prints all peaple that have last name begining with V
		System.out.println("Printing All Persons with last name V");
		printConditionally(peaple, person -> person.getLastName().startsWith("V"));

	}

	private static void printConditionally(List<Person> peaple, Predicate<Person> predicate) {
	
		for (Person person : peaple) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
			
		}
		
	}

	}


