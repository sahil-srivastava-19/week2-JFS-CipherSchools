import java.util.InputMismatchException;
import java.util.Scanner;

public class L13_1 {
    void cal() {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int n1 = sc.nextInt();
            System.out.println("Enter another numer:");
            int n2 = sc.nextInt();
            if (n2==0){
                throw new ArithmeticException();
            }
            result = n1 / n2;

        } catch (InputMismatchException e) {
            e.getStackTrace();
            System.out.println("IME Detected !");
        } catch (ArithmeticException e){
            System.out.println("AE Detected");
        } catch (Exception e) {
            System.out.println("Exception detected !");
        } finally {
            System.out.println("The result of the division is " + result);
        }
    }
}
class Test6{
    public static void main(String[] args) {
        L13_1 e=new L13_1();
        e.cal();
    }
}
//Try: represents/contains the code that we think will generate a runtime exception.
//Catch: executes only if any error/exception occurs in the try block, if there is no exception it will not generate any error.
//Finally: code written in this block will run every time even if the exception is raised or not.
//Throw: It is basically used to raise the exception manually.
//Throws: It temporarily fixes the exception and needed to add a try/catch block for resolution.