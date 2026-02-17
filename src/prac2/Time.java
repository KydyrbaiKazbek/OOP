package prac2;

public class Time {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public Time(){}
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    @Override
    public String toString(){
        return this.toUniversal();
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Parameters are out of range");
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public void setTimeConverted(int hour, int minute, int second) {
        int s = second + minute*60 + hour*3600;
        if(s>=0) {
            setTime(s/3600%24, s/60%60,s % 60);
        }else{
            throw new IllegalArgumentException("Time cannot be negative");
        }
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandard() {
        String suffix = (hour > 12) ? "PM" : "AM";
        int h12 = (hour%12==0) ? 12 : hour%12;
        return String.format("%02d:%02d:%02d %s", h12, minute, second, suffix);
    }

    public static Time add (Time t1, Time t2) {
        Time temp_t = new Time();
        temp_t.setTimeConverted(t1.hour+t2.hour, t1.minute+t2.minute, t1.second+t2.second);
        return temp_t;
    }

    public void add(Time t_other) {
        this.setTimeConverted(this.hour+t_other.hour, this.minute+t_other.minute, this.second+t_other.second);
    }

    public static void main(String[] args){
        Time t1 = new Time(23,5,6);
        Time t2 = new Time(4,24,33);
        Time t3 = new Time();
        t3.setTimeConverted(11,-30,-1);
        System.out.print("t1: ");
        System.out.println(t1.toUniversal());
        System.out.println(t2.toStandard());
        System.out.println(t3);
        System.out.println(add(t1,t2));
        t2.add(t1);
        System.out.println(t2);
    }
}
