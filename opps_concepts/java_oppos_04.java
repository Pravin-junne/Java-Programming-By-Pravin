
public class java_oppos_04 {
    
    public static void main(String args[]){
    Triangle t1 = new Triangle(); //obj of triangle class
    t1.printD(); //method in triangle class
    t1.display(); //method in shape class
    }
}

//class shape
class Shape{
    public void display(){
        System.out.println("i am in shape class");
    }
}

//class triangle
class Triangle extends Shape{
    public void printD(){
        System.out.println("i am in triangle class");
    }
}
