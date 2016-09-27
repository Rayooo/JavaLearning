/**
 * Created by Ray on 2016/9/26.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 3
 */
public class Lab3_1 {
    public static void main(String[] args){
        double[] list = {1,9,3.6,4.8,-3.8};
        //两遍for选择排序
        for (int i = 0;i < list.length;++i){
            for (int j = i;j < list.length; ++j){
                if(list[j] < list[i]){
                    double tmp = list[j];
                    list[j] = list[i];
                    list[i] = tmp;
                }
            }
        }
        for (double num : list){
            System.out.print(num +", ");
        }

    }

}
