// Author: Hayden Migliore
// Date: August 1, 2019
// Problem: Given a list of numbers and a number k, 
//      return whether any two numbers form the list 
//      add up to k. For example, given [10, 15, 3, 7] 
//      and k of 17, return true since 10 + 7 is 17. 
// Bonus: Can you do this in one pass? 

package dcp1;
import java.util.Scanner;

public class DCP1 {
    public static void main(String[] args) {
        //Initialize varialbes
        Scanner input = new Scanner(System.in);
        Boolean addition = false;
        int[] set = new int[5];
        
        //Create Set through console
        System.out.printf("Please enter 5 numbers for set. \n");
        set[0] = input.nextInt();
        set[1] = input.nextInt();
        set[2] = input.nextInt();
        set[3] = input.nextInt();
        set[4] = input.nextInt();
        
        //Create k through console
        System.out.printf("Please enter K. \n");
        int k = input.nextInt();
        
        //Test set and K
        if(set[0] + set[1] == k)
            addition = true;
        if(set[0] + set[2] == k)
            addition = true;
        if(set[0] + set[3] == k)
            addition = true;
        if(set[0] + set[4] == k)
            addition = true;
        if(set[1] + set[2] == k)
            addition = true;
        if(set[1] + set[3] == k)
            addition = true;
        if(set[1] + set[4] == k)
            addition = true;
        if(set[2] + set[3] == k)
            addition = true;
        if(set[2] + set[4] == k)
            addition = true;
        if(set[3] + set[4] == k)
            addition = true;
        
        //Output
        System.out.printf("Output is: " + addition + " \n");
    }   
}
