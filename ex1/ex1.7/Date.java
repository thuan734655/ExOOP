public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public  void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        String Sday = String.valueOf(this.day);
        String Smonth = String.valueOf(this.month);
        if (this.day < 10 ) {
            Sday = "0" + this.day;
        }
        if (this.month <10) {
            Smonth = "0" + this.month;
        }
        return Sday  +"/" + Smonth + "/" + this.year ;
    }
}
