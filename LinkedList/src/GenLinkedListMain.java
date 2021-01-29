
public class GenLinkedListMain {

	public static void main(String[] args) {
		LinkedListGen<String> obj = new LinkedListGen();
		
		
		for(int i=0;i<5;i++) {
			obj.add(i+" Added");
		}
		obj.print();
		

	}

}
