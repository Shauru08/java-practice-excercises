/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ellol
 */
public class FindLongestStringInAList {

    /**
     * Exercise: Find the Longest String in a List
     *
     * Objective: Given a list of strings, find the longest string in the list. If multiple strings have the same maximum length,
     * return the first one encountered.
     *
     * Steps: 1. Create a list of strings as input. 2. Use the Stream API to process the list. - Compare the lengths of the
     * strings using a Comparator. - Use the max() method to find the string with the maximum length. 3. Handle cases where the
     * list is empty by providing a default value using orElse() or throwing an exception with orElseThrow(). 4. Print the longest
     * string.
     *
     * Example: Input: ["apple", "banana", "cherry", "blueberry", "kiwi"] Output: Longest String: blueberry
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "blueberry", "kiwi");
        System.out.println("Input: "+list);

        System.out.println("The longest string in the list is: "
                + list.stream() //list.stream() allows to create an Stream from an existing collection
                        .max(Comparator.comparing(String::length)) //Max calculate the parameters inside. In this case we are using a Comparator to validate String::length ( Being String the data type contained into the List and Lenght a method to retrieve the length of the value )
                        .orElse("") //Or Else allows us to prevent null / Optional values as if no value is found it'll throw this message in the console. 
        );
    }
}
