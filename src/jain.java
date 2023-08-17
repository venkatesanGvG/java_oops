import java.io.*;
class Studen{
    void stud(){
        System.out.println("Student");

    }

}
class Staff extends Studen{
    void staff(){
        System.out.println("Staffs");
    }
}
public class jain {
    public static void main(String[]args){
        Staff s=new Staff();
        s.staff();
        s.stud();


    }
}