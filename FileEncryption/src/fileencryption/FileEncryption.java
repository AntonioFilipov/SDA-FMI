package fileencryption;
import java.util.LinkedList;
import fileencryption.FileEncoder61736;
/**
 *
 * @author Tonkata
 */
public class FileEncryption {

  
    public static void main(String[] args) {
        FileEncoder61736 encoder = new FileEncoder61736();
        LinkedList<Character> list = new LinkedList<Character>();
        for(int i = 255; i > -1; i--) {
            list.add((char)i);
        }
        long time;
        time=System.currentTimeMillis();
        encoder.encode("D:\\test_input.bin", "D:\\encode.txt", list);
        time = System.currentTimeMillis()-time;
        System.out.println(time + " ms");
        
        time=System.currentTimeMillis();
        encoder.decode("D:\\encode.txt", "D:\\decode.bin", list);
        time = System.currentTimeMillis()-time;
        System.out.println(time + " ms");
    }
}
