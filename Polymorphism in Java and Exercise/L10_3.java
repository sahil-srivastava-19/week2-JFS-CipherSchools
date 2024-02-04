public class L10_3 {
    public static void main(String[] args) {
        Addition add=new Addition();
        add.sum(5,6);
        add.sum(5,6,8);
        add.sum(5.5f,6);
    }
}
class Addition{
    void sum(int i1,int i2){
        System.out.println(i1+i2);
    }
    void sum(int i1,int i2,int i3){
        System.out.println(i1+i2+i3);
    }
    void sum(float i1,int i2){
        System.out.println(i1+i2);
    }
}