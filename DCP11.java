// Author: Hayden Migliore
// Date: August 12, 2019
// Problem: Implement an autocomplete system. That is, 
// given a query string s and a set of all possible 
// query strings, return all strings in the set that 
// have s as a prefix. For example, given the query string 
// de and the set of strings [dog, deer, deal], return 
// [deer, deal]. Hint: Try preprocessing the dictionary into 
// a more efficient data structure to speed up queries.

package dcp11;
import java.util.HashSet;

public class DCP11 {
    
    public static void main(String[] args) {
        //Intialize string and sets
        String s = "de";
        HashSet<String> dictionary = new HashSet<String>();
        HashSet<String> autocomplete = new HashSet<String>();
        
        //Add strings to dictionary
        dictionary.add("dog");
        dictionary.add("deer");
        dictionary.add("deal");
        
        //Add relevant dictionary strings to autocomplete
        for(String test : dictionary){
            if (test.contains(s))
                autocomplete.add(test);
        }
        
        //Print autocomplete answers
        for(String output : autocomplete){
            System.out.printf(output + "\n");
        }
    }
    
}
