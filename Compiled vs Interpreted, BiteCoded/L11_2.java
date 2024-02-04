class App {
    App(){
        System.out.println("Constructor of app");
    }
    App(int num){
        this();
        System.out.println("Calling of the parameterized constructor");
    }
}
 public class L11_2 extends App{

    L11_2(){
        super(20);
        System.out.println("Constructor of the derived class");
    }

     public static void main(String[] args) {
         new L11_2();
     }
}
// If you call the constructor of the derived class then the constructor of the base class is automatically invoked.
// The main reason for the use of super keyword is that it is used to call the parameterized constructor of the base class which is not
//invoked automatically.