import java.util.Scanner;

/**
 * Created by Ray on 16/9/16.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 1
 */
public class Lab1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an amount in double:");
        double amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("请不要输入小于0的数值");
            return;
        }

        int tenYuan = (int)amount / 10;
        amount -= tenYuan * 10;

        int fiveYuan = (int)amount / 5;
        amount -= fiveYuan * 5;

        int oneYuan = (int)amount;
        amount -= oneYuan;

        amount *= 100;

        int fiveQuarter = (int)amount / 50;
        amount -= fiveQuarter * 50;

        int oneQuarter = (int)amount / 10;
        amount -= oneQuarter * 10;

        int fiveCent = (int)amount / 5;
        amount -= fiveCent * 5;

        int twoCent = (int)amount / 2;
        amount -= twoCent * 2;

        int oneCent = (int)amount;

        System.out.println(tenYuan + "个10元");
        System.out.println(fiveYuan + "个5元");
        System.out.println(oneYuan + "个1元");
        System.out.println(fiveQuarter + "个5角");
        System.out.println(oneQuarter + "个1角");
        System.out.println(fiveCent + "个5分");
        System.out.println(twoCent + "个2分");
        System.out.println(oneCent + "个1分");

    }
}
