import java.io.*;
import java.util.Date;

/**
 * Created by Ray on 2016/11/15.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 8
 */
public class Oos {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        Date date = new Date();
        double num = 5.5;

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("exercise3.dat"));
            oos.writeObject(array);
            oos.writeObject(date);
            oos.writeObject(num);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exercise3.dat"));
            int [] a = (int[])ois.readObject();
            System.out.println(a[0]);
            Date fileDate = (Date)ois.readObject();
            System.out.println(fileDate);
            double b = (double)ois.readObject();
            System.out.println(b);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
