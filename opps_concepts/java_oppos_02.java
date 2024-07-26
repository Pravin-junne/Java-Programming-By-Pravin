import java.util.*; 
//oops -02
public class java_oppos_02 {
    
    public static void main(String args[]){
        Student s1 = new Student("Pravin", 21); //object of Student class
        s1.printInfo();
    }
    
}

//student class
class Student{
    String name;
    int age;

    //paramitrized constractor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

        //method 
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
