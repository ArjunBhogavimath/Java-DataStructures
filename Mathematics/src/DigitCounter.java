import java.util.Scanner;

public class DigitCounter {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println(count);

	}

}
