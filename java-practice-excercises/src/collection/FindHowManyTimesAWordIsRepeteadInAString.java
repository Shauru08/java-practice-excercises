/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author ellol
 */
public class FindHowManyTimesAWordIsRepeteadInAString {

    /**
     * Exercise: Count Words in a String
     *
     * Objective: Given a string, count the number of times each word appears (case-insensitive).
     *
     * Steps: 1. Split the input string into words using spaces or punctuation as delimiters. - Use `String.split("\\W+")` to
     * break the string into words. 2. Convert all words to lowercase to ensure case-insensitivity. - Example: "This" and "this"
     * are treated as the same word. 3. Use a `Map` to store the words and their frequencies: - Key: The word. - Value: The count
     * of occurrences of the word. 4. Traverse the words and update the frequency map: - Use `Map.merge(key, 1, Integer::sum)` to
     * increment the count. 5. Print the word and its frequency.
     *
     *
     */
    public static void main(String[] args) {
        String input = "This is a test. This test is only a test.";
        System.out.println("Input: " + input);

        //Split the input string into words and save them into an String array
        String[] words = input.split("\\W+");

        //Save words into a Map to count their frequency
        Map<String, Integer> wordsFreq = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            //If the word is already into the map, then i'll sum +1 to its value
            if (wordsFreq.containsKey(words[i])) {
                wordsFreq.put(words[i], wordsFreq.get(words[i])+ 1);
            } else {
                //If not in the map, then i'll add it
                wordsFreq.put(words[i], 1);
            }
        }
        System.out.println("Output: "+wordsFreq);
        System.out.println("The most frequent word was: "+
                wordsFreq.entrySet()
                        .stream()
                        .max(Comparator.comparing(Map.Entry::getValue)));
    }
    
}
