import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L16_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Product> products=new ArrayList<Product>();
        Product p=new Product();
        System.out.print("No .of items you want to add in your cart: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Enter the name: ");
            p.title=sc.next();
            System.out.println("Enter the price: ");
            p.price= sc.nextInt();
            products.add(p);
    }
        System.out.println(products.toString());
}
static class Product{
    String title;
    int price;

    }
}
