class polymorph
{
    void poly(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition of Two Numbers: "+c);
    }
    void poly(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("Addition of Three Numbers: "+d);
    }
}

public class Jpro1 {

    public static void main(String[] args) {
        polymorph obj=new polymorph();
        obj.poly(4, 6);
        obj.poly(5, 6, 7);
    }
}