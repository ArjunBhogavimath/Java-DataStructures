package Test;
/*Rotate a string with given
input value : Hardik, 2
output : rdikHa*/


public class Solution3 {

	public static void main(String[] args) {
		String s = "Hardik";
		int value = 2;
		String firstsub = s.substring(2,s.length());
		String lastsub = s.substring(0,2);
		String ans = firstsub.concat(lastsub);
		System.out.println(ans);
		

	}

}
