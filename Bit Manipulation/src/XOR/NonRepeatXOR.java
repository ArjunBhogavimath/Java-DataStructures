package XOR;

public class NonRepeatXOR {

	public static void main(String[] args) {
		int a[] = {5,4,1,4,3,5,1};
		int res = 0;
		int i=0;
		while(i<a.length) {
			res^=a[i];
			i++;
		}
		System.out.println("The only non repeating number is : "+res);

	}

}
