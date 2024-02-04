 class AA {
    AA(){
        System.out.println("This is AA");
    }
}
class BB extends AA{
    BB(){
        System.out.println("This is BB");
    }
}
class CC extends BB{
    CC(){
        System.out.println("This is CC");
    }

    public static void main(String[] args) {
        CC c=new CC();
    }
}
