package XOR;

public class NonRepeatTwoXOR {

	public static void main(String[] args) {
		int a[] = {5,4,1,4,3,5,1,2};
		int res = 0;
		int ref[] = new int[10];
		int even[]= new int[10];
		int oddnew=0;
		int evennew=0;
		for(int i=0;i<a.length;i++) {
			res^=a[i];
			
			if(a[i]%2!=0) {
				int j=0;
				ref[j]=a[i];
				j++;	
			}
			
			else {
				int k=0;
				even[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<ref.length;i++) {
			oddnew^=ref[i];
		}
		for(int i=0;i<even.length;i++) {
			evennew^=even[i];
		}
		System.out.println("The two non repeating elements are : "+ oddnew+","+evennew);
		
	}

}
