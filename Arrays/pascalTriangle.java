import java.util.*;

public class Main {
    public static void main(String[] args) {
        // input
        int rows = 5;
        
        List<List<Integer>> matrix = new ArrayList<List<Integer>>(); 
        List<Integer> currRow = null;
        List<Integer> prevRow = null;
        
        for (int i=0; i<rows; ++i) {
            currRow = new ArrayList<Integer>();
            for (int j=0; j<=i; ++j) {
                if (j==0 || j==i) {
                    currRow.add(1);
                } else {
                    currRow.add(prevRow.get(j-1) + prevRow.get(j));
                }
            }
            prevRow = currRow;
            matrix.add(currRow);
        }
        
        System.out.println(matrix);
    }    
}

// output:
// [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
