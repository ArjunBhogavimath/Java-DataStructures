import java.util.Scanner;

public class LogDigitCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = (int)Math.floor(Math.log10(num));
		System.out.println(count+1);
		

	}

}
 