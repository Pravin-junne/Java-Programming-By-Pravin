//multi level inheritance
public class java_oppos_11 {
    public static void main(String args[]){
        Tiger t1 = new Tiger();
        t1.name = "shera";
        System.out.println(t1.name);
        System.out.println(t1.leg);
        System.out.println(t1.bite);
    }
}

//base class
class Cat{
    String name;
}

//drived class 
class Dog extends Cat{
    int leg = 4;
}

//Drived class
class Tiger extends Dog{
    boolean bite = true;
}
