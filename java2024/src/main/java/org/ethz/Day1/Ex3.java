package org.ethz.Day1;

public class Ex3 {
    
    public static void main(String[] args) {


        /* Initial value of the counter */
        int x = 2;  // Corrected from double to int, as we don't need a decimal value
        double sum = 0.0;  // Added missing semicolon
        
        // Loop through values of x and calculate the sum
        for (; x < 10; x++) {
            sum += x;
        }

        // Print the result
        System.out.println("Sum is: " + sum);  // Fixed the quotation marks
        
    }
}
        



