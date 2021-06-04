public class Data {
    private final int year;
    private final int month;
    private final int day;
    public Data(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String priDate(){
        return (getYear()+"."+getMonth()+"."+getDay());
    }
}
