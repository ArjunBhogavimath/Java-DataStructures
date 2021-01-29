package Comparable;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		
		student.add(new Student(23,"Raj"));
		student.add(new Student(12,"Kevin"));
		student.add(new Student(98,"Alexa"));
		student.add(new Student(12,"Raj"));
		student.add(new Student(31,"Lucky"));
		
		//for this comparable interface and compareTo method needed
		Collections.sort(student);
		
		//lambda print statement
		
		student.forEach(System.out::println);
		
		

	}

}


