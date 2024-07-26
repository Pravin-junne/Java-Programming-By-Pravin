import java.util.*;

//main class
public class java_oppos_03 {
    public static void main(String args[]){
        Person p1 = new Person();
        p1.name = "Tushar";
        p1.age = 21;

        Person p2 = new Person(p1);
        p2.printInfo();
    }
}

//person class
class Person{
    String name;
    int age;

    //non parametraized constractor
    Person(){

    }

    //copy constractor
    Person(Person p2){
        this.name = p2.name;
        this.age = p2.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}