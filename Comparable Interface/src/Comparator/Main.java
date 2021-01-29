package Comparator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		
		student.add(new Student(23,"Raj"));
		student.add(new Student(12,"Kevin"));
		student.add(new Student(98,"Alexa"));
		student.add(new Student(12,"Raj"));
		student.add(new Student(31,"Lucky"));
		
		
		//Collections.sort(student, new SortByNameThenMarks());
		
		//creating anonymous class 
//		Collections.sort(student, new Comparator<Student>(){
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name==o2.name) {
//					return o1.marks-o2.marks;
//				}
//				else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//			
//		});
		
		
		//lambda for anonymous class
//		Collections.sort(student, (o1, o2) ->{
//							if(o1.name==o2.name) {
//							return o1.marks-o2.marks;
//							}
//							else {
//								return o1.name.compareTo(o2.name);
//						}
//					});
		
		
		//only sort based on name
		//Collections.sort(student, (o1, o2) -> o1.name.compareTo(o2.name));
		
		//using key extractor and comparing method
		//Collections.sort(student, Comparator.comparing(Student::getName));//getname is a method in student class based on that element will be sorted
		
		
		//using comparing and then comparing method for 2nd comparison
		//Collections.sort(student, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
		
		//using comparing and then comparing method for 2nd comparison and reverse will reverse the order 
		Collections.sort(student, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		
		
		//lambda print statement
		student.forEach(System.out::println);
		
		

	}

}


//implement a class for comparator interface

//class SortByNameThenMarks implements Comparator<Student>{
//
//	@Override
//	//it will first sort by name and then marks
//	public int compare(Student o1, Student o2) {
//		if(o1.name==o2.name) {
//			return o1.marks-o2.marks;
//		}
//		else {
//			return o1.name.compareTo(o2.name);
//		}
//		
//	}
//	
//}