import java.util.Scanner;
class CourseException extends Exception {
    public CourseException(String msg) {
        super(msg);
    }
}
public class Student {
    static Scanner in=new Scanner(System.in);
    private final String stu_name;
    private final String stu_sex;
    private final String stu_id;
    private final String stu_mail;
    private final Data birthday;
    private final int age;
    private static int sno;
    public Course [] course;

    public Student(String stu_name, String stu_sex, String stu_id, String stu_mail, Data birthday, int age,Course [] course){
        this.stu_name=stu_name;
        this.stu_sex=stu_sex;
        this.stu_id=stu_id;
        this.stu_mail=stu_mail;
        this.birthday=birthday;
        this.age=age;
        this.course=course;
    }

    public static Course[] chooseCourse(){
        System.out.println("请输入选课数目");
        return new Course[in.nextInt()];
    }
    public static int results()throws CourseException{
        System.out.println("请输入选课成绩");
        int c=in.nextInt();
        if(c<0||c>100)
            throw new CourseException("成绩录入不在规定范围内，0~100");
        return c;
    }
    public static boolean email(String r){
        int str1 = r.indexOf("@");
        int str2 = r.indexOf(".");
        if (str1 < str2 && str1 > 0) {
            System.out.println("邮箱格式正确");
            return true;
        } else {
            System.out.println("邮箱格式错误,请重新输入");
            return false;
        }
    }

    public String getStu_id() {
        return stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public String getStu_sex() {
        return stu_sex;
    }

    public String getStu_mail() {
        return stu_mail;
    }

    public Data getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public static int getSno() {
        return sno;
    }

    public void ShowAll(){
        sno++;
        System.out.println(getStu_name()+"信息及选课情况：");
        System.out.println ("姓名"+getStu_name()+" 学号"+getSno()+" 性别"+getStu_sex()+" 身份证号"+getStu_id()+" 邮箱"+getStu_mail()+
                " 出生日期"+getBirthday().priDate()+" 年龄"+getAge());
        for (Course course1:course
        ) {
            System.out.println(course1.detail());
        }
    }
}
