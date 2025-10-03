package task1;

import java.util.*;

public class TopKFrequent {

    public List<String> topKFrequent(String[] words, int k) {
        final Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        final List<String> uniqueWords = new ArrayList<>(freqMap.keySet());

        uniqueWords.sort((word1, word2) -> {
            int freq1 = freqMap.get(word1);
            int freq2 = freqMap.get(word2);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }
            return word1.compareTo(word2);
        });

        return uniqueWords.subList(0, k);
    }

    public static void main(String[] args) {
        final TopKFrequent solution = new TopKFrequent();

        final String[] words1 = {"java", "python", "java", "golang", "java", "python"};
        int k1 = 2;
        System.out.println("Input: words = " + Arrays.toString(words1) + ", k = " + k1);
        System.out.println("Output: " + solution.topKFrequent(words1, k1));
        System.out.println();
    }
}
