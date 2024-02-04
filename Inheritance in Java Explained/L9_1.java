public class L9_1 {
    public static void main(String[] args) {
        Chair ch=new Chair();
        ch.display("Chair");
    }
}
class Furniture{
    int width;
    int height;
    void display(String name){
        System.out.println(name+" Width:"+this.width+" height:"+this.height);
    }
}
class Chair extends Furniture{
    void foo(){
        width=10;
        height=20;
        display("Chair");
    }
}
class Table extends Furniture{
    void foo(){
        width=30;
        height=50;
        display("Table");
    }
}
class Almira extends Furniture{
    void foo(){
        width=100;
        height=200;
        display("Almira");
    }
}
