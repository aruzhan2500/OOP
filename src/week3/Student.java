package week3;

public class Student extends Person5 {

    public String program;
    public  int year;
    public double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram(){
        return this.program;
    }
    public void setProgram(String prog){
        this.program = prog;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        this.year = y;
    }
    public double getFee(){
        return this.fee;
    }
    public void setFee(double f){
        this.fee = f;
    }
    @Override
    public String toString(){
        return "Name is "+ name +" address is " + address + " program is " + this.program + " year is " + this.year + " fee is " + this.fee;
    }
}