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
public class CalculateTotalSumOfIntegerValuesOnListUsingStreamReduce {

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
                .reduce(0, Integer::sum); // The second parameter, Integer::sum, defines the logic to sum elements.
                                          // Starting with 0 (identity), it adds each element in the stream to the running total.
        
        System.out.println("Total sum is: "+sum);
    }
}

/**
 * The `reduce` method is a terminal operation in the Stream API that aggregates elements of a stream into a single result.
 *
 * Syntax: T reduce(T identity, BinaryOperator<T> accumulator)
 * - `identity`: The initial value of the reduction (e.g., 0 for summation).
 * - `accumulator`: A function that combines two elements to produce a new result.
 *
 * How it works:
 * 1. The stream starts with the `identity` as the initial result.
 * 2. For each element in the stream, the `accumulator` is applied, combining the current result with the element.
 * 3. The process continues until all elements are processed, resulting in a single aggregated value.
 *
 **/
