public class LongestCompletePassSequence {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the list of items as command line arguments.");
            return;
        }

        int[] items = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            items[i - 1] = Integer.parseInt(args[i]);
        }

        int longestSequenceLength = findLongestCompletePassSequence(items);
        System.out.println("Longest sequence of complete passes: " + longestSequenceLength);
    }

    private static int findLongestCompletePassSequence(int[] items) {
        int longest = 0;
        int current = 0;

        for (int item : items) {
            if (item == -1) {
                current = 0; // Reset current sequence length if encounter "I"
            } else {
                current++; // Increment current sequence length for completed pass
                longest = Math.max(longest, current); // Update longest if necessary
            }
        }

        return longest;
    }
}
