package lab1.problem3;

public class Temperature {
    private double temperature = 0;
    private char scale='C';

    public static Boolean check_scale(char c){
        if (c=='C' || c=='F') {return true;}
        else {System.err.println("Error: scale must be C or F");
        }
        return false;
    }
    //Constructors
    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }
    public Temperature(char scale) {
        if (check_scale(scale)){
            this.scale = scale;
            this.temperature = 0;
        }
    }

    public Temperature(double temperature, char scale) {
        if (check_scale(scale)){
            this.temperature = temperature;
            this.scale = scale;
        }
    }

    public Temperature() {}
    //Getters 1/2
    public double getC(){
        return (this.scale=='C') ? temperature : (temperature-32)/1.8;
    }
    public double getF(){
        return (this.scale=='F') ? temperature : temperature*1.8+32;
    }

    //Setters
    public void setScales(char scale) {
        if (check_scale(scale)) this.scale = scale;
    }
    public void setValue(double value) {
        this.temperature = value;
    }
    public void setTemperature(double value, char scale) {
        if  (check_scale(scale)) {
            this.temperature = value;
            this.scale = scale;
        }
    }
    //Getter 2/2
    public char getScale() {
        return scale;
    }
}
