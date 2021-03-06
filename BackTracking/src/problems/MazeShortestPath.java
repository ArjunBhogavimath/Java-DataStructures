package problems;


//Maze Shortest path using backtracking
public class MazeShortestPath {

	public static void main(String[] args) {
		int a[][] = {{1,1,0,1,0,1,1,0},
					{1,0,1,0,1,0,1,1},
					{1,1,0,1,1,1,0,1},	
					{0,1,1,1,1,0,0,1},
					{1,1,0,1,0,1,1,1},
					{0,0,1,0,1,0,0,1}
		};
		
		
		int result =shortestPath(a,0,0,4,0);
		
		if(result>=10000)
			System.out.println("Path not found");
		else 
			System.out.println(result);

	}
	
	static int shortestPath(int a[][], int i,int j,int x,int y) {
		int rows=a.length;
		int col=a[0].length;
		
		boolean vis[][] = new boolean[rows][col];
		
		return shortestPath(a,i,j,x,y,vis);
	}
	static boolean isValid(int a[][],int i,int j,boolean vis[][]) {
		int rows=a.length;
		int col=a[0].length;
		return i>=0 && j>=0 && i<rows && j<col && a[i][j]==1 && !vis[i][j];
	}
	
	
	//method over loading
	static int shortestPath(int a[][], int i,int j,int x,int y,boolean vis[][]) {

		if(!isValid(a,i,j,vis)) return 10000;
		
		if(i==x && j==y) return 0;
		
		vis[i][j] = true;
		int left=shortestPath(a,i,j-1,x,y,vis)+1;
		int bottom =shortestPath(a,i+1,j,x,y,vis)+1;
		int right =shortestPath(a,i,j+1,x,y,vis)+1;
		int top =shortestPath(a,i-1,j,x,y,vis)+1;
		
		
		vis[i][j]=false;
		return Math.min(Math.min(left, bottom), Math.min(right , top));
	}

}
