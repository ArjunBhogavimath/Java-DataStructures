package recursion_Ex;

public class FastPower {
	
	static int slow_count =0;
	static int fast_count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("slow :"+pow(3,1000));
		System.out.println("slow count :"+slow_count);
		
		System.out.println("fast solution :"+fastPow(3,1000));
		System.out.println("fast count :"+fast_count);

	}
	
	//slow
	static int pow(int a,int b) {
		slow_count++;
		if(b==0) 
			return 1;
		return a*pow(a,b-1) ;
	}
	
	//fast solution
	static int fastPow(int a,int b) {
		fast_count++;
		if(b==0) {
			return 1;
			 }
		if(b%2==0) {
			return fastPow(a*a,b/2);
			}
		return a*fastPow(a,b-1);
	}

}
