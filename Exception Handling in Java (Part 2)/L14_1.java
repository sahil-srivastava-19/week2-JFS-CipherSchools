public class L14_1 {
    int getNextNo(int n){
        try{
            if(n==5){
                return n+1;
            }
        }
        finally{
            System.out.println("This is an important code");
        }
        return n-1;
    }

    public static void main(String[] args) {
        L14_1 obj=new L14_1();
        System.out.println(obj.getNextNo(5));
    }
}
