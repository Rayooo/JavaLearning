import java.util.Scanner;

/**
 * Created by Ray on 2016/10/10.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 4
 */
public class Lab4_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0;
        int j = s.length() - 1;
        boolean isReverse = true;
        while (i <= j){
            if(s.charAt(i) != s.charAt(j)){
                isReverse = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(s + (isReverse? " is a palindrome":" is not a palindrome"));

    }
}
