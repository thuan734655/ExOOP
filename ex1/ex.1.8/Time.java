public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public  String toString () {
        String hour = String.valueOf(this.hour);
        String minute = String.valueOf(this.minute);
        String second = String.valueOf(this.second);
        if (this.hour <  10 ) {
            hour = "0" + this.hour;
        }
        if(this.minute <10) {
            minute = "0" + this.minute;
        }
        if (this.second < 10) {
            second = "0" + this.second;
        }
        return hour + ":" + minute + ":" + second;
    }
    public Time nextSecond() {
        this.second ++;
        if(this.second == 60) {
            this.second = 0;
            this.minute ++;

        }
        if ( this.minute == 60) {
            this.minute = 0;
            this.hour ++;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }

        return this;
    }
    public Time previousSecond() {


        this.second --;
        if(this.second < 0) {
            this.second = 59;
            this.minute --;

        }
        if ( this.minute < 0) {
            this.minute = 59;
            this.hour --;
            if(hour == -1) {
                hour = 23;
            }
        }

        return this;
    }
}
