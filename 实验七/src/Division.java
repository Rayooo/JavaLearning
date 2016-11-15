import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ray on 2016/11/15.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 7
 */
public class Division {
    public static Integer quotient(int numerator, int denominator){
        try {
            if(denominator == 0){
                throw new ArithmeticException();
            }
            else{
                return numerator/denominator;
            }
        }catch (Exception e){
            System.out.println("Zero is an invalid denominator. Please try again.");
            return null;
        }

    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isSuccess = false;
        while (!isSuccess){
            boolean isInteger = false;
            String strA = null;
            String strB = null;
            while (!isInteger){
                strA = scanner.nextLine();
                strB = scanner.nextLine();
                try {
                    if(!strA.matches("^-?\\d+$") || !strB.matches("^-?\\d+$")){
                        throw new InputMismatchException();
                    }
                    else{
                        isInteger = true;
                    }
                }catch (Exception e) {
                    System.out.println("You must enter integers. Please try again.");
                    isInteger = false;
                }
            }

            int a = Integer.parseInt(strA);
            int b = Integer.parseInt(strB);
            Integer result = quotient(a,b);
            if(result == null){
                isSuccess = false;
            }
            else{
                isSuccess = true;
                System.out.println(result);
            }
        }
    }
}
