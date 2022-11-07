import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        // input
        ArrayList<List<Integer>> inputArr = new ArrayList<>();
        inputArr.add(Arrays.asList(new Integer[]{1,3}));
        inputArr.add(Arrays.asList(new Integer[]{2,4}));
        inputArr.add(Arrays.asList(new Integer[]{2,6}));
        inputArr.add(Arrays.asList(new Integer[]{8,9}));
        inputArr.add(Arrays.asList(new Integer[]{8,10}));
        inputArr.add(Arrays.asList(new Integer[]{9,11}));
        inputArr.add(Arrays.asList(new Integer[]{15,18}));
        inputArr.add(Arrays.asList(new Integer[]{16,17}));
        
        // 
        ArrayList<List<Integer>> resultArr = merge(inputArr);
        
        // to print the result arr
        System.out.println("Merged Overlapping Intervals are ");
        for (List<Integer> arrItem : resultArr) {
            System.out.println(arrItem.get(0) + " " + arrItem.get(1));
        }
    }
    
    public static ArrayList<List<Integer>> merge(ArrayList<List<Integer>> inputArr) {
        // sort the input arr
        Collections.sort(inputArr, (a,b) -> a.get(0) - b.get(0));
        
        // create a new empty array
        ArrayList<List<Integer>> resultArr = new ArrayList<>();
        
        // add values into it
        for (int i=0; i<inputArr.size(); i++) {
            if (resultArr.isEmpty() || resultArr.get(resultArr.size()-1).get(1) < inputArr.get(i).get(0)) {
                // if merge condtion doesn't satisfy
                ArrayList<Integer> arrItem = new ArrayList<>();
                arrItem.add(inputArr.get(i).get(0));
                arrItem.add(inputArr.get(i).get(1));
                resultArr.add(arrItem);
            } else {
                // if satisfy
                resultArr.get(resultArr.size()-1).set(1, Math.max(resultArr.get(resultArr.size()-1).get(1), inputArr.get(i).get(1)));
            }
        }
        
        return resultArr;
    }
    
}
