package oops.exceptinHandling;


public class ErrorTypes {
    public static void main(String[] args) {

 /**
  *
  *     Syntax Error or Compile Time Error  :
  *     Compile Time Errors are those errors which prevent the code from running because of an incorrect syntax such as a
  *     missing semicolon at the end of a statement or a missing bracket, class not found, etc. These errors are detected
  *     by the java compiler and an error message is displayed on the screen while compiling
  * */

        // system.out.println("Hello World"); // Syntax Error -> system should be System
        // int a = 10 // Syntax Error -> missing semicolon

/**
 * Logical Error : A logic error is when your program compiles and executes, but does the wrong thing or returns an incorrect
 * result or no output when it should be returning an output. These errors are detected neither by the compiler nor by JVM.
 *
 */
        int num = 789;
        int reversednum = 0;
        int remainder;

        while (num != 0) {

            // to obtain modulus % sign should
            // have been used instead of /
            remainder = num / 10;
            reversednum
                    = reversednum * 10
                    + remainder;
            num /= 10;
        }
        System.out.println("Reversed number is " + reversednum);

/**
 *  Run Time Error : Run time occurs when something goes wrong in the normal execution of a program. These errors are identified
 *  by jvm while executing the code and program stops at the line where run time error occurred.
 * */
       int a = 10;
       int b = 0;

        System.out.println("Division : " + a/b); // Run Time Error
        System.out.println("This line will not be executed because program stopped at line number 23 due to run time error");
    }
}
