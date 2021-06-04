import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now=new Date();
        System.out.println(fmt.format(now));
        String Nd=fmt.format(now);
        Nd=Nd.substring(0,4);
        int Nd1=Integer.parseInt(Nd);
        Scanner in=new Scanner(System.in);
        Student [] Data1=new Student[2];
        for(int i=0;i< Data1.length;i++) {
            System.out.println("请输入姓名");
            String na1=in.next();
            System.out.println("请输入身份证号");
            String id1=in.next();
            String sex0=id1.substring(16,17);
            int sex1=Integer.parseInt(sex0);
            String year0=id1.substring(6,10);
            int year1=Integer.parseInt(year0);
            String mon0=id1.substring(10,12);
            int mon1=Integer.parseInt(mon0);
            String day0=id1.substring(12,14);
            int day1=Integer.parseInt(day0);
            System.out.println("请输入邮箱");
            boolean bo;String r;
           do{ r = in.next();
          bo= Student.email(r);}while (!bo);
            Data birthday = new Data(year1,mon1,day1);
            int a=Nd1-year1;
               try {
                   Course [] cou=Student.chooseCourse();
                   for(int k=0;k< cou.length;k++) {
                       System.out.println("请输入选择的课程编号和课程名称");
                       int n0 = in.nextInt();
                       String n1 = in.next();
                       int n2=Student.results();
                       Course co = new Course(n0, n1,n2);
                       cou[k] = co;
                   }
                   Student td = new Student(na1,(sex1%2==0)?"女":"男",id1,r,birthday,a,cou);
                       Data1[i] = td;
               }catch(Exception e){
                   System.out.println(e.getMessage());
                   e.printStackTrace();
               }finally {
                   System.out.println("程序结束");
               }
            }
        for (Student student : Data1) {
            student.ShowAll();
        }
    }
}
