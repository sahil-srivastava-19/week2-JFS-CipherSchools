import java.sql.SQLOutput;
import java.util.Scanner;

public class L12_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey buddy ! how old are you ?");
        int n=sc.nextInt();
        System.out.println("Woha ! You are really grown up.You are "+n+" years old.");
    }
}
//Checked Exceptions are checked at the runtime. Ex -> IOException
//Unchecked exceptions are checked at runtime. Ex -> InputMismatchException
