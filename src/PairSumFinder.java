import java.util.HashMap;

public class PairSumFinder {
    public static int countPairsWithSum(int[] nums, int target) {
        // Create a HashMap to store the occurrences of each number
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        int count = 0;

        // Iterate through the array to find pairs
        for (int num : nums) {
            int complement = target - num;

            // Check if the complement is present in the HashMap
            if (occurrences.containsKey(complement)) {
                // Increment the count of pairs with the sum equal to the target
                count += occurrences.get(complement);
            }

            // Update the HashMap with the current number's occurrence
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 3, 5, 4, 9, 8, 1};
        int target = 9;
        int pairsCount = countPairsWithSum(nums, target);
        System.out.println("Number of pairs that sum up to " + target + " is: " + pairsCount);
    }
}
