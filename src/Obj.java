import java.io.*;
class Student{
    String name;
    int roll;
    String email;

}
class Obj {
    public static void main(String[]args){
        Student s=new Student();
        s.name="Venkat";
        s.roll=115;
        s.email="VenkatG@gmail.com";
        System.out.println(s.name+" "+s.roll+" "+s.email);
    }
}