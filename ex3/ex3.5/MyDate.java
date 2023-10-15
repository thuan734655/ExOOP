import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public String[] MONTHS = {"Jan" , "Fed" , "Mar","Apr", "May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    public String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday", "Friday","Saturday"};
    public int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeapYear(int year) {
         return ((year % 4 == 0 && year % 100 != 0) ||( year % 400 == 0 ));
    }
     public boolean isValidDate(int year, int month, int day) {
          if (!(year >= 1 && year <= 9999)) return false;
          if (!(month >= 1 &&  month <=12)) return false;

          if (day < 0 || day > 31) return false;
          else {
              if (month == 4 ||month == 6 || month == 9 ||month == 11) {
                  if (day > 30)
                      return false;
                   else
                       return true;
              }
              if (month == 2) {
                  if(isLeapYear(year)) {
                      if (day <= 29) return true;
                  }
                  else {
                      if(day <= 28) return true;

                      else {
                          return false;
                      }
                  }
              }
               return true;
          }
     }

     public int getDayOfWeek(int year, int month , int day) {
         LocalDate date = LocalDate.of(year,month,day);
         DayOfWeek days = date.getDayOfWeek();
         if(days.getValue() == 7) {
            return 0;
         }
        return days.getValue();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year, int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        }
        else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month  <= 12) {
            this.month = month;
        }
        else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public void setDay(int day) {
        if(day >=1 && day <= 31) {
            this.day = day;
        }
        else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }
    public String toString() {
        return DAYS[getDayOfWeek(year,month,day)] +" "+ day +" "+ MONTHS[month -1] + " " + year;
     }

    public MyDate nextDay() {
        if(day < 29 && month == 2 && isLeapYear(year)) {
            day++;
            return this;
        }
        if (day < DAYS_IN_MONTHS[month - 1]) {
            day++;
        } else {
            if (month < 12) {
                month++;
                day = 1;
            } else {
                year++;
                month = 1;
                day = 1;

                if(year > 9999)
                    throw new IllegalArgumentException("Year out of range!");
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            month++;
            if (day > DAYS_IN_MONTHS[month - 1]) {
                if (day > 29 && month == 2 && isLeapYear(year)) {
                    day = 29;
                }
                else day = DAYS_IN_MONTHS[month - 1];

            }
        }
            else {
                month = 1;
                year++;
            }
        return this;
    }
    public MyDate nextYear() {
        if (year <= 9999) {
            year++;

            if (day > 28 && month == 2 && !isLeapYear(year)) {
                day = 28;
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }
    public MyDate previousDay() {
        if (day > 1) {
            day--;
        }
        else {
            if (month > 1) {
                month--;
                day = DAYS_IN_MONTHS[month - 1];
            } else {
                year--;
                month = 12;
                day = DAYS_IN_MONTHS[month - 1];
            }
        }
        return this;
    }
    public MyDate previousMonth() {
        if (month > 1) {
            month--;
            if (day > DAYS_IN_MONTHS[month - 1]) {
                if (day > 29 && month == 2 && isLeapYear(year)) {
                    day = 29;
                }
                else day = DAYS_IN_MONTHS[month - 1];
            }
        }
        else {
            year--;
            month = 12;

        }
        return this;
    }

    public MyDate previousYear() {
        if (year > 1) {
            year--;
            if (day > 28 && month == 2 && !isLeapYear(year)) {
                day = 28;
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

}
