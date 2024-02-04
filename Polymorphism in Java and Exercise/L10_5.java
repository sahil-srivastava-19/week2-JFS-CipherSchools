public class L10_5 {
}
class A{
    protected int a=9;
    protected void display(){
        System.out.println(this.a);
    }
}
class B{
    public static void main(String[] args) {
        A a=new A();
        a.display();
        int a1=a.a;
        System.out.println(a1);
    }
}