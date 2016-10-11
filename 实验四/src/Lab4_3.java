import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ray on 2016/10/10.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 4
 */
public class Lab4_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String pattern = "^[A-za-z0-9]{8,}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(password);
        if(m.find()){
            String pattern2 = "[0-9]";
            r = Pattern.compile(pattern2);
            m = r.matcher(password);
            int count = 0;
            while (m.find()){
                count++;
            }
            if(count >= 2){
                System.out.println("Valid  Password");
            }
            else{
                System.out.println("InValid  Password");
            }
        }
        else{
            System.out.println("InValid  Password");
        }
    }
}
