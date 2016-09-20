import java.util.Scanner;

/**
 * Created by Ray on 2016/9/20.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 2
 */
public class Lab2_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight:");
        double weight = scanner.nextDouble();
        System.out.print("Enter height:");
        double height = scanner.nextDouble();
        if(weight <= 0 || height <= 0){
            System.out.println("输入数字有误");
            return;
        }
        double BMI = weight / height /height;
        System.out.println("BMI is:" + BMI);

        if(BMI < 16){
            System.out.println("严重偏瘦");
        }
        else if(BMI >= 16 && BMI < 18){
            System.out.println("偏瘦");
        }
        else if(BMI >= 18 && BMI < 24){
            System.out.println("正常");
        }
        else if(BMI >= 24 && BMI < 29){
            System.out.println("偏胖");
        }
        else if(BMI >= 29 && BMI < 35){
            System.out.println("严重偏胖");
        }
        else if(BMI >= 35){
            System.out.println("极度偏胖");
        }
    }

}
