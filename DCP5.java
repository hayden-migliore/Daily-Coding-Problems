// Author: Hayden Migliore
// Date: August 6, 2019
// Problem: cons(a, b) constructs a pair, and car(pair) 
// and cdr(pair) returns the first and last element of 
// that pair. For example, car(cons(3, 4)) returns 3, 
// and cdr(cons(3, 4)) returns 4.

package dcp5;
import javafx.util.Pair;
import java.util.Scanner;

public class DCP5 {

    public static void main(String[] args) {
        //Get values from console
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter two values. \n");
        Object value1 = input.nextLine();
        Object value2 = input.nextLine();
        
        //Pair Objects
        Pair p = cons(value1, value2);
        System.out.printf("The result from cons is " + p + ".\n");
        
        //Get first and second value
        Object answer1 = car(p);
        Object answer2 = cdr(p);
        System.out.printf("The result from car is " + answer1 + ".\n");
        System.out.printf("The result from cdr is " + answer2 + ".\n");
        
    }
    
    static Pair cons(Object a, Object b){
        Pair p = new Pair(a, b);
        return p;
    }
    
    static Object car(Pair p){
        Object a = p.getKey();
        return a;
    }
    
    static Object cdr(Pair p){
        Object b = p.getValue();
        return b;
    }
}
