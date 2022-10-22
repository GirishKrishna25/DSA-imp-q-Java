
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int buy = arr[0];
        int buyIndex = 0;
        int sell;
        int currentProfit = 0;
        int profit = 0;
        // to find buy
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < buy) {
                buy = arr[i];
                buyIndex = i;
            }
        }
        // to find profit
        for (int i=buyIndex + 1; i<arr.length; i++) {
            sell = arr[i];
            currentProfit = sell - buy;
            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }
        System.out.println(profit);
    }
}
