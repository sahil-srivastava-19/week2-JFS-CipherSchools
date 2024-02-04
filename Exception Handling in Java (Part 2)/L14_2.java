import java.io.File;
import java.io.IOException;

public class L14_2 {
    public static void main(String[] args) throws IOException {
        File f=new File("D://abc.txt");
        f.createNewFile();
    }
}
