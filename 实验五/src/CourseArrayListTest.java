import java.util.ArrayList;

/**
 * Created by Ray on 2016/10/18.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 5
 */
public class CourseArrayListTest {
    public static void main(String[] args){
        CourseArrayList chinese = new CourseArrayList("语文");
        CourseArrayList math = new CourseArrayList("数学");

        math.addStudent("小陈");
        math.addStudent("小汤");
        math.addStudent("小李");

        System.out.println("学生数：" + math.getStudentCount());

        math.dropStudent("小汤");
        System.out.println("删除一名学生后,课程中存在学生");
        ArrayList<String > students = math.getStudents();
        students.forEach(System.out::println);

    }
}
