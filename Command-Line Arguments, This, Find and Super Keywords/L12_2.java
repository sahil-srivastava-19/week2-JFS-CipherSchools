import java.io.File;

public class L12_2 {
    public static void main(String[] args) {
        try{
            File f=new File("d://abc.txt");
            f.createNewFile();
        }catch (Exception e){}
    }
}
