public class L11_1 {
}
class Test0{
    int arg=5;
     Test0(){
         System.out.println("Hi, I am a default constructor.");
     }
     Test0(int arg){
         this();
         this.arg=arg;
     }

    public static void main(String[] args) {
        Test0 t=new Test0(10);
        System.out.println(t.arg);
    }
}
