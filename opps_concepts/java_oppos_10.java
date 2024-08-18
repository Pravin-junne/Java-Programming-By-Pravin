//single level inheritance
public class java_oppos_10 {
 public static void main(String args[]){
    Cat c1 = new Cat();
    c1.bite();
    c1.eat();
    c1.legs();
 }   
}

//Base class
class Dog{
    void legs(){
        System.out.println("has four leg");
    }

    void eat(){
        System.out.println("Eating");
    }

    void bite(){
        System.out.println("animal can bite");
    }
}

//drived class
class Cat extends Dog{

}
