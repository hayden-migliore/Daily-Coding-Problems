// Author: Hayden Migliore
// Date: August 5, 2019
// Problem: Given an array of integers, return an new
//      array such that each element at index i of the
//      new array is the product of all of the numbers
//      in the original array except the one at i. For
//      exampe if our input was [1, 2, 3, 4, 5] the
//      output woudlb e [120, 60, 40, 30, 24]. If our
//      input was [3, 2, 1], the expected output would
//      be [2, 3, 6]. Follow-up: waht if you can't use
//      division?

package dcp2;
import java.util.Scanner;

public class DCP2 {

    public static void main(String[] args) {
        
        //Initialize variables
        Scanner input = new Scanner(System.in);
        System.out.printf("Set size of array. \n");
        int i = input.nextInt();
        int sum = 1;
        int[] set = new int[i];
        int[] answer = new int[i];
        
        //Create Set through console
        System.out.printf("Please enter " + i + " numbers for set. \n");
        for (int j = 0; j < i; j++){
            set[j] = input.nextInt();
        }
        
        //Process new set
        for (int j = 0; j < i; j++){
            for (int k = 0; k < i; k++){
                if (k != j){
                    sum = sum * set[k];
                }
            }
            answer[j] = sum;
            sum = 1;
        }
        
        //Output new set
        System.out.printf("The output is ");
        for (int j = 0; j < i; j++){
            System.out.printf(answer[j] + " ");
        }

    }   
}
