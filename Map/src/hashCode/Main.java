package hashCode;

public class Main {

	public static void main(String[] args) {
		
		Pen p1=new Pen(10,"Blue");
		Pen p2=new Pen(10,"Blue");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1);//prints hashcode of the p1 object
		System.out.println(p2);

	}

}


class Pen{
	int price;
	String color;
	
	public Pen(int p, String clr) {
		this.price=p;
		this.color=clr;
	}
}
