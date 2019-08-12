// Author: Hayden Migliore
// Date: August 12, 2019
// Problem: Implement a job scheduler which takes in a 
// function f and an integer n, and calls f after n 
// milliseconds.

package dcp10;
import java.util.concurrent.*;

public class DCP10 {
    public static void main(String[] args) {      
        //Intialize scheduler, n, and startTime
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        int n = 20;
        long startTime = System.nanoTime();
        
        //Create f
        Runnable f = new Runnable() {
            public void run() {
                long endTime = System.nanoTime();
                double totalTime = (endTime - startTime) * 0.000001;
                System.out.printf("F has executed " + totalTime);
            }
        };        
        
        //Run f
        scheduler.schedule(f, n, TimeUnit.MILLISECONDS);
        
        //Shutdown f
        scheduler.shutdown();
        
    }   
}

