//method overriding
public class java_oppos_15 {
    public static void main(String args[]){
        Dear d1 = new Dear();
        d1.eat();   
        
    }
}
//base class animal
class Animal{
    void eat(){
        System.out.println("Eat anything...");
    }
}
//drived class Dog from Animal;
class Dear extends Animal{
    void eat(){
        System.out.println("Eat grass...");
    }
}