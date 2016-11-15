import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by Ray on 2016/11/15.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 8
 */
public class Upcase {
    public static void main(String[] args){
        Scanner in = null;
        PrintWriter writer = null;
        try {
            in = new Scanner(new File("readFile"));
            writer = new PrintWriter("write.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        while (in != null && writer!= null && in.hasNext()) {
            writer.println(in.nextLine().toUpperCase());
        }

        if (in != null) {
            in.close();
        }
        if(writer != null){
            writer.close();
        }
    }

}
