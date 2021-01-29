
public class Main {

	public static void main(String[] args) throws Exception {
		MyStackImp istack = new MyStackImp(6);
		
	     istack.push(21);
	     istack.push(54);
	     istack.push(12);
	     istack.push(89);
	     istack.push(78);
	     System.out.println(istack.pop());
	     System.out.println(istack.pop());
	}

}
