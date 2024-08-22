//static variable
public class java_oppos_18 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setData("Pravin", 4012);
        s1.getData();
        System.out.println(s1.collegName); //static variable call..

    }
}

class Student{
    String name;
    int rollNo;
    static String collegName = "BJS college";   //static variable //same for all objects
    void setData(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void getData(){
        System.out.println("Name:"+name);
        System.out.println("Roll No:"+rollNo);
    }
}