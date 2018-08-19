package files;
import java.io.*;

/**
 * Created by NM on 14.08.2018.
 */
public class WriteReadFile {
        public static void read() {

            FileReader reader = null;
            try {
                reader = new FileReader("baki.txt");
            } catch (FileNotFoundException e) {
                System.out.println("cant create object reader:");
                System.out.println(e.getMessage());

            }

            int i;
            try {
                while((i=reader.read()) != -1){
                    System.out.print((char)i);
                }
            } catch (IOException ioe){
                System.out.println("cant read file:");
                System.out.println(ioe.getMessage());
            }


        }
}
