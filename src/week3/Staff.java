package week3;

public class Staff extends Person5 {

    public String school;
    public double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String  getSchool(){
        return this.school;
    }
    public void setSchool(String sc){
        this.school=sc;
    }
    public double getPay(){
        return this.pay;
    }
    public void setPay(double p){
        this.pay=p;
    }
    @Override
    public String toString(){
        return "Name is "+ name +" address is "+ address +" school is "+ school +" pay is "+ pay;
    }
}
