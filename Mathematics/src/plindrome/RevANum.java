package plindrome;
//Palindrome problem
public class RevANum {

	public static void main(String[] args) {
		int n =121;
		int remainder;
		int reverseInteger = 0;
		int original = n;
		while(n!=0) {
			remainder=n%10;
			reverseInteger=reverseInteger*10+remainder;
			n/=10;
		}
		if(original==reverseInteger) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not Palindrome"+reverseInteger);
		}

	}

}
