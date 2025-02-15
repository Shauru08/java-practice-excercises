/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author ellol
 */
public class FindMostFrequentElementOfAnIntArray {

    /**
     * Exercise: Find the Most Frequent Element
     *
     * Objective: Given an array of integers as input, find the most frequently occurring element. If there is a tie (multiple
     * elements with the same frequency), return the smallest element.
     *
     * Steps: 1. Count the occurrences of each element using a Map<Integer, Integer>. 2. Identify the element with the highest
     * frequency. In case of a tie, select the smallest element. 3. Print the most frequent element and its frequency.
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 3, 2, 3, 4, 1, 3, 2, 2, 1, 5, 1};
        System.out.println("Input: " + Arrays.toString(inputArray));

        //Use a hashmap to save the arrays values as keys, then will use the value to count how many times they exist on it.
        Map<Integer, Integer> freqMap = new HashMap<>();

        //Loop structure to traverse the array values.
        for (int i = 0; i < inputArray.length; i++) {
            //Get current value on a variable for comfort
            int inpValue = inputArray[i];
            //If the key is already on the map, will sum +1 to its value
            if (freqMap.containsKey(inpValue)) {
                freqMap.put(inpValue, freqMap.get(inpValue) + 1);
                System.out.println(String.format("Current Value for: %d is %d", inpValue, freqMap.get(inpValue)));
            } else {
                //If not, then i'll add the key, value starting at 1
                freqMap.put(inpValue, 1);
                System.out.println("new key added to the map: " + inpValue);
            }
        }
        System.out.println("FreqMap result: " + freqMap);
                
        System.out.println("Max Frequency is: "
                + freqMap.entrySet() // Indicates that we are working over the entrySet of the hashmap. EntrySet represents the key value pair.
                        .stream() // Stream allow us to use the operations
                        .max(Comparator.comparing(Map.Entry::getValue)) // max is used to calculate the max value of its parameters. Then we are using a comparator which take the Map.Entry and loop through it comparing all its values.
                        .orElseThrow()// Handle cases where map is null, also , it allows us to prevent the Optional message being printed into the console, making it more user frinedly.
        );

    }
}
