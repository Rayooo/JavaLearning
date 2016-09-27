import java.util.*;

/**
 * Created by Ray on 2016/9/26.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 3
 Jane
 90 87 98 88
 Jack
 78 89 76 67
 Tom
 45 65 35 57
 Smith
 87 78 79 89
 David
 67 76 65 60
 */
public class Lab3_2 {
    public static void main(String[] args){
        //创建哈希表，学生名和对应的成绩数组
        HashMap<String,double[]> studentList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < 5; ++i){
            System.out.print("Enter a student's name:");
            String name = scanner.nextLine();
            double[] score = new double[4];
            System.out.print("Enter the scores of the student:");
            for(int j = 0;j < 4;++j){
                score[j] = scanner.nextDouble();
            }
            scanner.nextLine();
            studentList.put(name,score);
        }

        System.out.print("The students’ grades are:\n");
        Iterator iterator = studentList.entrySet().iterator();
        //迭代输出
        while (iterator.hasNext()){
            Map.Entry student = (Map.Entry)iterator.next();
            System.out.print(student.getKey() + " \t");
            double[] score = (double[]) student.getValue();
            double total = 0;
            for(double num :score){
                total += num;
            }
            double average = total / 4.0;
            if(average >= 90 && average <= 100){
                System.out.println("A");
            }
            else if(average >= 80 && average < 90){
                System.out.println("B");
            }
            else if(average >= 70 && average < 80){
                System.out.println("C");
            }
            else if(average >= 60 && average < 70){
                System.out.println("D");
            }
            else if(average >= 0 && average < 60){
                System.out.println("F");
            }

        }

    }
}
