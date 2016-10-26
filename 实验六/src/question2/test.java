package question2;

/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class test {
    public static void main(String[] args){
        Circle a = new Circle(1);
        Circle b = new Circle(1);
        Circle c = new Circle(2);

        System.out.println(a.equals(b)? "两圆相同":"两圆不同");

        int result = c.compareTo(a);
        if(result == 0){
            System.out.println("c圆等于a圆");
        }
        else if(result > 0){
            System.out.println("c圆大于a圆");
        }
        else if(result < 0){
            System.out.println("c圆小于a圆");
        }

    }
}
