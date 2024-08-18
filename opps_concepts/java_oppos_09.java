public class java_oppos_09 {
    public static void main(String args[]){
        //non-paramitrized constractor
        Student s1 = new Student(); //object of non-paramitrized constractor.
        s1.name = "Pravin junne";
        s1.rollNo = 4412;
        System.out.println("This is the values of non-paramitrized constractor");
        System.out.println(s1.name+"\n"+s1.rollNo);

        //copy constractor
        Student s2 = new Student(s1);   //object of copy constractor
        System.out.println("This is the values of copy constractor");
        System.out.println(s2.name+"\n"+s2.rollNo);

    }
}

class Student{
    String name;
    int rollNo;
    Student(){

    }
    //copy constractor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
  }
}
