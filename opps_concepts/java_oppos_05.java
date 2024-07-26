

public class java_oppos_05 {
    
    public static void main(String args[]){
        Bank p1 = new Bank();
        p1.name = "Pravin";
        p1.age = 21;
        //p1.password = "Gogli";
        p1.setPass("Gogli@123"); //we can access private methods or variables by using geter and seter methods
        p1.getPass();
    }
}

//bank class
class Bank{
    public String name;
    public int age;

    private String password="pass@123"; //we can not access private vat outside the class

    //geter and seter
public void getPass(){
    System.out.println(this.password);
}

public void setPass(String password){
    this.password = password;
}
}
