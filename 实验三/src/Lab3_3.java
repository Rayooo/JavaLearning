import java.util.Scanner;

/**
 * Created by Ray on 2016/9/27.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 3
 */
public class Lab3_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = scanner.nextLine();
        System.out.print("Enter a character:");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0;i < str.length();++i){
            if(character == str.charAt(i)){
                ++count;
            }
        }
        System.out.println("count is:"+count);
    }

}
