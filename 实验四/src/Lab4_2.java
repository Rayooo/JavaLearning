/**
 * Created by Ray on 2016/10/10.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 4
 */
public class Lab4_2 {
    public static void main(String[] args){
        StringBuilder s1=new StringBuilder("java");
        StringBuilder s2=new StringBuilder("html");

        StringBuilder result1 = s1.append(" is fun");
        System.out.println(result1);

        s1=new StringBuilder("java");
        StringBuilder result2 = s1.insert(2,"is fun");
        System.out.println(result2);

        s1=new StringBuilder("java");
        int result3 = s1.charAt(2);
        System.out.println(result3);

        s1=new StringBuilder("java");
        StringBuilder result4 = s1.deleteCharAt(2);
        System.out.println(result4);

        s1=new StringBuilder("java");
        StringBuilder result5 = s1.delete (1,3);
        System.out.println(result5);

        s1=new StringBuilder("java");
        StringBuilder result6 = s1.reverse ();
        System.out.println(result6);

        s1=new StringBuilder("java");
        StringBuilder result7 = s1.replace (1,3,"computer");
        System.out.println(result7);

        s1=new StringBuilder("java");
        String result8 = s1.substring (1,3);
        System.out.println(result8);

        s1=new StringBuilder("java");
        String result9 = s1.substring (2);
        System.out.println(result9);

    }


}
