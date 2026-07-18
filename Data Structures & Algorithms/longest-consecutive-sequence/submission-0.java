

class Solution {
    public int longestConsecutive(int[] nums) {

        Hashtable<Integer, Boolean> table = new Hashtable<>();

        // Store all numbers
        for (int num : nums) {
            table.put(num, true);
        }

        int longest = 0;

        // Traverse array
        for (int num : nums) {

            // Check if this is the start of a sequence
            if (!table.containsKey(num - 1)) {

                int current = num;
                int length = 1;

                // Count consecutive numbers
                while (table.containsKey(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}