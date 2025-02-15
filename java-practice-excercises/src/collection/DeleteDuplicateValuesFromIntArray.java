/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 *
 * @author ellol
 */
public class DeleteDuplicateValuesFromIntArray {

    /**
     * *
     * Given an array of integers as input, returns a new array with all duplicate values removed. Ensure the original order of
     * elements is preserved.
     */
    public static void main(String[] args) {
        //Input Array with duplicates values
        int[] inputArray = {1, 2, 3, 2, 4, 5, 1, 6, 4};
        System.out.println("Input: " + Arrays.toString(inputArray));

        inputArray = Arrays
                .stream(inputArray)//indicates that will be operating over the array data
                .distinct()//Distinc helps to clean duplicates
                .toArray(); //Turn stream manipulation back into array
        
        System.out.println("Output: " + 
                Arrays.toString(inputArray)//Print toString from array, if not used in this way it'll only print the hash
        );
    }
}
