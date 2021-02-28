package moduloArithmetic;

import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println(fastPower(a,b));
		System.out.println(fastPowerUsingModulo(3697452,5847,1000000007));

	}
	
	static int fastPower(int a,int b) {
		int res=1;
		
		while(b>0) {
			if((a&b)!=0) {
				res= res*a;
			}
			a=a*a;
			b=b>>1;//b/2
		}
		return res;
	}
	//modulo arithmetic
	static long fastPowerUsingModulo(long a,long b,int n) {
		long res=1;
		
		while(b>0) {
			if((a&b)!=0) {
				res= (res%n*a%n)%n;
			}
			a=(a%n*a%n)%n;
			b=b>>1;//b/2
		}
		return res;
	}

}
