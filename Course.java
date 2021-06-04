public class Course {
    public int course_no;
    public String course_name;
    public int results;
    public Course(int course_no, String course_name,int results) {
        this.course_no = course_no;
        this.course_name = course_name;
        this.results=results;
    }
    public String detail() {
            return "课程编号" + course_no + " 课程名称" + course_name+" 课程成绩"+results;
    }
}
