package hashCode;
import java.util.*;
public class Implemented {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p1=new Pencil(10,"Blue");
		Pencil p2=new Pencil(10,"Blue");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));

		Set<Pencil> pens=new HashSet<>();
		
		pens.add(p1);
		pens.add(p2);
		System.out.println(pens);
		
	}

}


class Pencil{
	int price;
	String color;
	
	public Pencil(int p, String clr) {
		this.price=p;
		this.color=clr;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pencil that = (Pencil) obj;
		boolean isEqual = this.color==that.color && this.price==that.price;
		return isEqual;
	}
	
	@Override
	public int hashCode() {
		return price+color.hashCode();
	}
}
