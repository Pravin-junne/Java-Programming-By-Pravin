
//main class
public class java_opps_01 {
    
    public static void main(String args[]){
        Pen pen1 = new Pen(); //created object of Pen class
        pen1.color = "red";
        pen1.type = "gel pen";
        pen1.write();
        pen1.printColor();
    }
}

//pen class
class Pen{
    String color;
    String type; //ballpoint; gel

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){//method to print color of a pen
        System.out.println(this.color);
    }
}