package prac3.problem2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.fee = fee;
        setYear(year);
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        if (program.length()>150){
            System.out.println("Program name connot be longer than 150");
        }else{
            this.program = program;
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < 1 || year > 6) {
            System.out.println("Invalid year of study");
        }else{
            this.year = year;
        }
    }

    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        if (fee < 0) {System.out.println("Fee cannot be negative");}
        else{this.fee = fee;}
    }

    @Override
    public String toString() {
        return super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee;
    }
}
