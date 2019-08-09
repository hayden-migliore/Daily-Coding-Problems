// Author: Hayden Migliore
// Date: August 9, 2019
// Problem: Given a list of integers, write a function 
// that returns the largest sum of non-adjacent numbers. 
// Numbers can be 0 or negative. For example, 
// [2, 4, 6, 2, 5] should return 13, since we pick 2, 
// 6, and 5. [5, 1, 1, 5] should return 10, since we 
// pick 5 and 5. Follow-up: Can you do this in O(N) 
// time and constant space?

package dcp9;
import java.util.Scanner;

public class DCP9 {

    public static void main(String[] args) {
        
        //Intialize variables
        int[] input = new int[] {2, 4, 6, 2, 5};
        //int[] input = new int[] {5, 1, 1, 5};
        int answer = 0;
        int length = input.length;
        int n = 0;
        
        //Find and output sum
        answer = findSum(input, length, n);
        System.out.printf("The largest, non-adjacent sum of is " + answer + ".\n");
    } 
    static int findSum(int[] input, int length, int n){
        int sum1 = 0;
        int sum2 = 0;
        
        //Base case
        if (n >= length)
            return 0;
        
        
        //Start from first int
        sum1 += input[n] + findSum(input, length, n + 2);
        
        //Start from second int
        if(length > n + 1)
            sum2 += input[n + 1] + findSum(input, length, n + 3);
        
        //Compare and return
        if (sum1 > sum2)
            return sum1;
        else
            return sum2;
    }
    
}
