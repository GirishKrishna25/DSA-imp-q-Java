import java.util.*;

class Main {
	public static void main(String args[]) {
		int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
		System.out.println("The initial matrix is");
		System.out.println(Arrays.deepToString(matrix));
		setZeros(matrix);
		System.out.println("The final matrix is");
		System.out.println(Arrays.deepToString(matrix));
	}
	
	static void setZeros(int[][] matrix) {
		int col0 = 1; // true
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i=0; i<rows; i++) {
			// first column check chestham.
			// yedhaina zero vunte, col0 ni 0 chesestham. 
			if (matrix[i][0] == 0) col0 = 0; // false
			for (int j=1; j<cols; j++) {
				// 0,1 0,2 
				// 1,1 1,2
				// 2,1 2,2
				// veetilo yedhi zero vunna,
				// first row and first column lo vunde value ni zero chesestham
				if (matrix[i][j] == 0) {
					matrix[0][j] = matrix[i][0] = 0;
				}
			}
		}
		
		// matrix lo vunde last value nundi values assign
		// cheskuntuu vastham
		for (int i=rows-1; i>=0; i--) {
			// first column joliki pomu
			for (int j=cols-1; j>=1; j--) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
			// ekkada dhani sangathi chustham
			if (col0 == 0) matrix[i][0] = 0;
		}
		
	}
	
}
