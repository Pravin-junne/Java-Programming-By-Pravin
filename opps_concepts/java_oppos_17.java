public class java_oppos_17 {
    public static void main(String args[]){
        King k1 = new King();
        k1.moves();
    }
}

interface cheesPlayer{
    void moves(); //methods in interface are by default pulic and abstract
}


class King implements cheesPlayer{
    public void moves(){
        System.out.println("up,down,left,right by one step");
    }
}