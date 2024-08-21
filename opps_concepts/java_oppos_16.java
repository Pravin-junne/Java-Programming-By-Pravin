public class java_oppos_16 {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.eat();
    }
}
//we can not create a objects of abstract class
//constractor call : Animal -> Dog
//we can not define abstract method inside abstract class we only declare it

abstract class Animal{
    Animal(){
        System.out.println("Animal constractor called...");
    }
    abstract void eat();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constractor called...");
    }
    void eat(){
        System.out.println("eats anything..");
    }
}
