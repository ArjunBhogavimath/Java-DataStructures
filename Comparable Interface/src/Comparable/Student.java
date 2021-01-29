package Comparable;


//needs to implement comparable interface to add comparable method 
public class Student implements Comparable<Student>{
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
	/*//This is increasing order
	 * @Override public int compareTo(Student o) { if(this.marks >o.marks) return 1;
	 * else if(this.marks < o.marks) return -1; return 0; }
	 */
	
//	@Override
//	//this is decreasing order
//	public int compareTo(Student o) {
//		if(this.marks <o.marks) 
//			return 1;
//		else if(this.marks > o.marks)
//			return -1;
//		return 0;
//	}
//	
//	@Override
//	//It will check if both marks are same it will sort by name
//	public int compareTo(Student o) {
//		if(this.marks <o.marks) 
//		return 1;
//		else if(this.marks > o.marks)
//			return -1;
//		return this.name.compareTo(o.name);
//	}
	
	//easy way
	
	@Override
	public int compareTo(Student o) {
		//decreasing order
		return this.marks-o.marks;
		//if positive then this.marks is bigger if negative object.marks is bigger
	}
}
