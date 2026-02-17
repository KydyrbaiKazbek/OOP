package prac2;

public class Student {
    private String name;
    private String id;
    private int year_of_study=1;
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void incrementYearOfStudy(){
        this.year_of_study++;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}
