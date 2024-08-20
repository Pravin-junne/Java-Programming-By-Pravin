//hierarchial inheritance
public class java_oppos_12 {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.eat();
        d1.bite();
    }
}

//base class
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

//drived class 
class Cat extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}

//drived class 
class Dog extends Animal{
    void bite(){
        System.out.println("biting...");
    }
}