public class L11_3 {
}
class Father{
 public final String lastname="Obroi";
 public void foodHabbits(){
     System.out.println("I like salty food !!!!");
 }
}
class Son extends Father{
    public void foodHabbits(){
        System.out.println("I like spicy food !!!!");
    }
}
//final variable cannot be changed or modified
//final method can not be overridden in the derived class
//making a class final prevents it to be extended for security reasons