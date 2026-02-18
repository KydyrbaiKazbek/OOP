package prac3.problem2;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        setPay(pay);
        setSchool(school);
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        if (school.length()>10){
            System.out.println("Use School's abbreviation, not full name.");
        }else{this.school = school;}
    }

    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        if (pay<0){System.out.println("Payment/Salary cannot be negative");}
        else{this.pay = pay;}
    }

    @Override
    public String toString() {
        return super.toString()+", school="+school+", pay="+pay;
    }
}
