/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ellol
 */
public class DeleteDuplicatesFromIntArrayUsingList {

    /**
     * Exercise: Delete Duplicates From Int Array Using List
     *
     * This exercise demonstrates how to remove duplicates from an int array by: 
     * 1-Converting the array to a List for manipulation. 
     * 2-Using a HashSet to filter out duplicates. 
     * 3-Converting the List back to an int array.
     * 
     */
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 1, 6, 4};
        System.out.println("Input: " + Arrays.toString(inputArray));

        //Turn array into a List to manipulate the data
        List<Integer> listArr = Arrays.stream(inputArray)
                .boxed() //Converts Int to Integer
                .filter(new HashSet<>()::add) // For every value into the array, the method add is called into the hashset, HashSets cannot contain duplicates so it helps filter them.
                .collect(Collectors.toList()); // Turn the stream proccesed data into the new List

        //Turn back the List into an Int array
        int[] filteredArray = listArr.stream()
                .mapToInt(Integer::intValue) // Converts Integer to int
                .toArray();

        System.out.println("Output: " + Arrays.toString(filteredArray));
    }
}
