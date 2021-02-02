package recursion_Ex;

import java.util.*;


public class SumOfNnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a =sc.nextInt();
		
		System.out.println("The sum of n numbers are :"+sum(12));
		
		
		System.out.println("The power is :"+pow(3,4));
		

	}
	//for calculating n natural numbers
	static int sum(int n) {
		if(n==1) 
			return 1;
		return n+sum(n-1);
	}
	
	//for a^b of
	
	static int pow(int a,int b) {
		if(b==0) 
			return 1;
		return a*pow(a,b-1) ;
	}

}
