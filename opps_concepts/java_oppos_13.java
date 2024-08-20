//hybrid inheritance

public class java_oppos_13{
    public static void main(String args[]){
        shark s1 = new shark();
        s1.f();
        s1.b();
        s1.a();
    }
}

//base class
class Animal{
    void a(){
        System.out.println("i am in animal class..\n animal is a base class");
    }
}

//drived classes of animal
class Fish extends Animal{
    void b(){
        System.out.println("fish is a drived class from animal..");
    }
}

class Bird extends Animal{
    void c(){
        System.out.println("bird is a drived class from animal");
    }
}

class Mammal extends Animal{
    void d(){
        System.out.println("mammal is a drived class from animal...");
    }
}

//drived classes of fish
class Tuna extends Fish{
    void e(){
        System.out.println("tuna is dirved class from drived class fish fom animal");
    }
}

class shark extends Fish{
    void f(){
        System.out.println("shark is drived class from fish...");
    }
}

//drived class of bird class
class Peacock extends Bird{
    void g(){
        System.out.println("peacock is drived class from bird..");
    }
}

//drived classes of mammal classs
class Dog extends Mammal{
    void x(){
        System.out.println("dog is drived class from mammal");
    }
}

class Cat extends Mammal{   
    void y(){
        System.out.println("cat is drived class from mammal");
    }
}

class Human extends Mammal{
    void  z(){
        System.out.println("Human is drived class from mammal");
    }
}