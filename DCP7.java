// Author: Hayden Migliore
// Date: August 8, 2019
// Problem: Given the mapping a = 1, b = 2, ... z = 26, 
// and an encoded message, count the number of ways it 
// can be decoded. For example, the message '111' would 
// give 3, since it could be decoded as 'aaa', 'ka', and 
// 'ak'. You can assume that the messages are decodable. 
// For example, '001' is not allowed.

package dcp7;
import java.util.HashMap;
import java.util.Scanner;

public class DCP7 {

    public static void main(String[] args) {        
        //Get message from console
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter in message. \n");
        String message = input.nextLine();
        
        //Set up variables for comparison
        char[] messageAr = message.toCharArray(); 
        int length = message.length();
        
        //Print answer
        System.out.printf("The answer is %d \n", compare(messageAr, length));
    }
    
    static int compare(char[] message, int length)  
    { 
    // Base cases for recursion
    if (length == 0 || length == 1) {
        return 1; 
    }
        
    // Initialize variables 
    int answer = 0;  
  
    //If not 0, get number from last digit
    if (message[length - 1] > '0') {
        answer = compare(message, length - 1); 
    }
  
    //Get number from last 2 message if < 27 && > 9
    if (message[length - 2] == '1' ||  (message[length - 2] == '2' && message[length - 1] < '7')){ 
        answer += compare(message, length - 2); 
    }
  
    return answer; 
    }   
}
