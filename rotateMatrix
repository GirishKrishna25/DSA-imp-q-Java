// turn cols into rows -> transpose
// swap first and last and move forward in a row

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = arr.length;
        int cols = arr[0].length;
        
        // transpose
        for (int i=0; i<rows; i++) {
            for (int j=i; j<cols; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // swap
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols / 2; j++) {
                int temp = arr[i][j];
                // for last element arr.length-1 is enough
                // but to get the prev element for next iterationwe need -j.
                // - is because we need previous value.
                // arr.length is same as cols or rows
                arr[i][j] = arr[i][cols - 1 - j];
                arr[i][cols - 1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        
    }
}

// output: 
// [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
