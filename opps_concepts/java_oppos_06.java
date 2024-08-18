//getter and setter
public class java_oppos_06 {
    public static void main(String args[]){
        Pen p1 = new Pen();
        //setters
        p1.setColor("Red");
        p1.setTip(5);

        //calling getters
        p1.getColor();
        p1.getTip();
    }
}

//class pen
class Pen{
    String color;
    int tip;

    //setters
    String setColor(String newColor){
        return this.color = newColor;
    }

    int setTip(int newTip){
        return this.tip = newTip;
    }

    //getters
    void getColor(){
        System.out.println(this.color);
    }
    void getTip(){
        System.out.println(this.tip);
    }
}
