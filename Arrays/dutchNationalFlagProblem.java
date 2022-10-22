// also called "Dutch national flag"

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,0,2,2};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;
        while (mid <= high) {
            switch(arr[mid]) {
                case 0:
                    // swap mid and low
                    temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    // move mid
                    mid++;
                    break;
                case 2:
                    // swap mid and high
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
