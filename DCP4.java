// Author: Hayden Migliore
// Date: August 5, 2019
// Problem: Given an array of integers, find the first 
// missing positive integer in linear time and constant 
// space. In other words, find the lowest positive integer 
// that does not exist in the array. The array can contain 
// duplicates and negative numbers as well. For example, 
// the input [3, 4, -1, 1] should give 2. The input 
// [1, 2, 0] should give 3.

package dcp4;
import java.util.Scanner;


public class DCP4 {

    public static void main(String[] args) {
        
        //Get size of sets
        Scanner input = new Scanner(System.in);
        System.out.printf("Set size of array. \n");
        int i = input.nextInt();
        int sum = 1;
        int[] set = new int[i];
        int[] answer = new int[i];
        Boolean in = false;
        
        //Create Set through console
        System.out.printf("Please enter " + i + " numbers for set. \n");
        for (int j = 0; j < i; j++){
            set[j] = input.nextInt();
        }
        
        //Find lowest missing integer
        for (int j = 1; j < 20; j++){
            for (int k = 0; k < i; k++){
                if (set[k] == j)
                    in = true;
            }
            if (in == false){
                System.out.printf("Output is " + j);
                break;
            }
            in = false;
        }
    }  
}
