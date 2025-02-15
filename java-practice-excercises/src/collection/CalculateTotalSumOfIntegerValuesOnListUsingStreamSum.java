/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author ellol
 */
public class CalculateTotalSumOfIntegerValuesOnListUsingStreamSum {

    /**
     * Exercise: Calculate the Total Sum of Integer values
     *
     * Objective: Given a list of Integer values , calculate the total sum of the numbers in the list.
     *
     * Steps: 1. Sum all the integers. 2. Print the result.
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Input: " + list);

        int sum = list.stream()
                .mapToInt(Integer::intValue) //mapToInt turn the Integer stream into an int (intValue is a method, we cannot change its name for it to works.)
                .sum();//Call for sum method to sum the int values that we have in the int stream
        
        System.out.println("Total sum is: "+sum);
    }
}
