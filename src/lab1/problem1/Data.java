package lab1.problem1;

public class Data {
    private double max = Double.NEGATIVE_INFINITY;
    private double sum = 0d;
    private int cnt = 0;

    public Data(){}

    public void add(double val){
        sum+=val;
        cnt++;
        if (val>max){max = val;}
    }

    public double average(){
        return sum/cnt;
    }

    public double max(){
        return max;
    }
}
