package week3;

public class Person5 {
	protected String name;
    protected String address;
    public Person5(String name, String address){
        this.name = name;
        this.address = address;

    }
    public  String getName(){
        return this.name;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setAddress(String addr){
        this.address = addr;
    }
    public String toString(){
        return "Name is "+ name +" address is " + address;
    }
}
