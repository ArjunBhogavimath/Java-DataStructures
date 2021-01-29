package Comparator;



public class Student{
	public int marks;
	public String name;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setId(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
	
	
	
	public int compareTo(Student o) {
		//decreasing order
		return this.marks-o.marks;
		//if positive then this.marks is bigger if negative object.marks is bigger
	}
}
