/**
 * Created by Ray on 2016/10/18.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 5
 */
public class CourseTest {
    public static void main(String[] args){
        Course chinese = new Course("语文");
        Course math = new Course("数学");

        math.addStudent("小陈");
        math.addStudent("小汤");
        math.addStudent("小李");

        System.out.println("学生数：" + math.getStudentCount());

        math.dropStudent("小汤");
        String[] students = math.getStudents();
        System.out.println("删除一名学生后,课程中存在学生");
        for (int i = 0; i < math.getStudentCount();++i){
            System.out.println(students[i]);
        }

    }

}
