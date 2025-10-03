package task4;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static Map<String, Integer> countWords(String text) {
        final String cleanText = text.toLowerCase().replaceAll("[.,!?;:]", "");

        final String[] words = cleanText.split("\\s+");

        final Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        final String input = "This is a test. This is only a test";
        final Map<String, Integer> result = countWords(input);

        System.out.println("Input: " + input);
        System.out.println("\nOutput:");

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
