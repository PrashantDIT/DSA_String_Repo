import java.util.*;

public class xyz3 {

    public static String generateMaxLexicographicalString(String input_str) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> charOccurrences = new HashMap<>();

        // Count the occurrences of each character
        for (char c : input_str.toCharArray()) {
            charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Populate the max heap with characters that occur at least twice
        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            if (entry.getValue() >= 2) {
                maxHeap.offer(entry.getKey());
            }
        }

       // Build the result string by removing one occurrence of each character from max heap
for (char c : input_str.toCharArray()) {
    if (charOccurrences.get(c) >= 2 && maxHeap.contains(c)) {
        result.append(c);
        charOccurrences.put(c, charOccurrences.get(c) - 1); // Decrease occurrence count
        if (charOccurrences.get(c) == 1) {
            maxHeap.remove(c); // Remove from maxHeap if only one occurrence is left
        }
    }
}


        // Append the remaining characters from the max heap
        while (!maxHeap.isEmpty()) {
            result.append(maxHeap.poll());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abacaba"; // Replace with your input string
        String result = generateMaxLexicographicalString(input);
        System.out.println("Max lexicographical string: " + result);
    }
}
