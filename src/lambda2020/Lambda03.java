package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(10);
		list.add(14);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(13);
		list.add(16);
		System.out.println(list);
		
		//Use Structured Code to print the square of every element on the console
		for(int w:list) {
			System.out.print(w*w + " ");
		}
		
		System.out.println("====");
		//Use Functional Code to print the square of every element on the console
		list.stream()
		    .map(t->t*t) // map() gets the element, updates it according to the right part (t*t)
		                 // and navigates to the next line
		    .forEach(System.out::print);
		
		System.out.println("====");
		//Print the cube of every odd elements
		list.stream()
		    .filter(t->t%2!=0)
		    .map(t->t*t*t + " ")
		    .forEach(System.out::print);
		
		System.out.println("====");
		//Print the square of the elements which are divisible by 4
		list.stream()
		    .filter(t->t%4==0) // First filter than use map() 
		    .map(t->t*t + " ")
		    .forEach(System.out::print); 
	
	}

}
