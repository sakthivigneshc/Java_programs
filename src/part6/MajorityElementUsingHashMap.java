import java.util.*;

public class MajorityElementUsingHashMap {
    public static void main(String[] args) {
        int [] numbers = {2,4,5,9,6,7,8,9,9,9,9,9,9};
        int numbers_length = numbers.length;
        boolean found = false; // flag to track majority element
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count occurrences of each element
        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Iterate through the map to find the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > numbers_length / 2) {
                System.out.println("Majority Element: " + entry.getKey());
                found = true;
                break; // stop once majority element is found
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
/*
Time and space complexity 
 The time complexity of your HashMap solution is **O(n)** because you traverse the array once to build the map and then iterate over the map entries.  
 The space complexity is **O(n)** in the worst case since the map may store counts for all distinct elements.
*/
