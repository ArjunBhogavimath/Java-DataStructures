package recursion_Ex;

public class FloodFillProbRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,1,1,2,0,0},
					{1,0,1,2,0,2},
					{1,2,0,2,2,2},
					{1,0,1,2,0,1},
					{1,2,1,1,0,1},
					{1,1,1,0,1,2}};
		
		floodFill(a,0,0,3,1);
		printMatrix(a);
		

	}
	
	static void floodFill(int a[][], int r,int c, int toFill, int prev) {
		int rows=a.length;
		int col = a[0].length;
		
		if(r<0 || r>=rows ||c<0 || c>=col) {
			return;
		}
		
		if(a[r][c]!=prev) {
			return;
		}
		a[r][c]=toFill;
		
		floodFill(a,r-1,c,toFill,prev);
		floodFill(a,r,c-1,toFill,prev);
		floodFill(a,r,c+1,toFill,prev);
		floodFill(a,r+1,c,toFill,prev);
		
	
		
			
	}
	
	static void printMatrix(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
