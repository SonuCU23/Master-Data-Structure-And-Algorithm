package oops.exceptinHandling;

public class StackTrace {
    public static void main(String[] args) {
        try {
            methodA();

            System.out.println ("Exit main ()");
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException caught ...");

            /* In this example, the error handler simply prints the stack trace, which provides useful information for
            debugging. */
            ex.printStackTrace();
        }finally {
            System.out.println("Finally block in main()");
        }

        System.out.println("After try-catch-finally, life goes on.....");
    }

    public static void methodA(){
        System.out.println("Inside methodA()");
        int a = 5, b = 0;
        try{
             int c = a / b;
        }
        finally {
            System.out.println("Finally block in methodA()");
        }

        System.out.println("Exit methodA()");
    }


}
