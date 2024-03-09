package oops.exceptinHandling;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        // sensitive code inside try block, which might generate an exception
        try {
            // Below line of code may throw FileNotFoundException
            Scanner scn = new Scanner(new File("input.txt"));

            // If Everything goes well, then below line will be executed
            // If exception occurs in previous statement, then below line will not be executed
            System.out.println("Exit Main....");
        }
        // Error handling separated from the main logic
        catch (FileNotFoundException e) {
            System.out.println("File not found...." + e.getMessage());

            /**
             *  If the file cannot be found, the exception is caught in this catch-block
             *  In some situation, you may need to perform some clean up operations or another file instead
             * */
        }
        // OPTIONAL : Always runs regardless of exception status
        finally {
            System.out.println("finally-block runs regardless of the state of exception");
        }

        /*After try-catch-finally , will not be executed in cases of Uncaught exception or when not handled in catch */
        System.out.println("After try-catch-finally, life goes on.....");
    }


}
