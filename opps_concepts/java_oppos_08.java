public class java_oppos_08 {
    public static void main(String args[]){
        Person p1 = new Person("pravin");
        System.out.print(p1.name);
    }
}

class Person{
    String name;
    //paramitrized constractor
    Person(String name){
        this.name = name;
    }
}