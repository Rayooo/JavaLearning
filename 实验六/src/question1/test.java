package question1;
/**
 * Created by Ray on 2016/10/25.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 6
 */
public class test {
    public static void main(String args[]){
        Person person = new Person();
        System.out.println(person.toString());

        Student student = new Student("大一");
        System.out.println(student.toString());

        Employee employee = new Employee();
        System.out.println(employee.toString());

        Faculty faculty = new Faculty();
        System.out.println(faculty.toString());

        Staff staff = new Staff();
        System.out.println(staff.toString());


    }
}
