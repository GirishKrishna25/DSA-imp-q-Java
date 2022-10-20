import java.util.*;

// from right, we find out the element which breaking the increasing order
// now we find the greater element than the found element from left
// swap them
// reverse the remaining array

public class Main
{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        // int[] arr = {5, 4, 3, 2, 1};
        
        // use this line in assessemnts
        // if (arr == null || arr.length <= 1 ) return;
        
        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i+1]) i--;
        
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i+1, arr.length-1);
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void reverse(int[] arr, int i, int j) {
        while(i < j) swap(arr, i++, j--); 
    }
}

// output
// [1, 4, 2, 3, 5]
