import java.util.Scanner;

class Marks
{
    int avg;
    int avg1;
    void sem1(int m1,int m2,int m3)
    {
        avg=m1+m2+m3/3;
        System.out.println("GPA is: "+avg);
    }
    void sem2(int m4,int m5,int m6)
    {
        avg1=m4+m5+m6/3;
        System.out.println("GPA is:"+avg1);
    }
    void calc()
    {
        int cg=avg+avg1/2;
        System.out.println("CGPA is: "+cg);
    }
}
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter No Of Students: ");
        int stu=x.nextInt();
        for(int i=1;i<=stu;i++)
        {
            System.out.println("Student "+i);
            System.out.println("Enter Mark1: ");
            int m1=x.nextInt();
            System.out.println("Enter Mark2: ");
            int m2=x.nextInt();
            System.out.println("Enter Mark3: ");
            int m3=x.nextInt();
            System.out.println("Enter Mark4: ");
            int m4=x.nextInt();
            System.out.println("Enter Mark5: ");
            int m5=x.nextInt();
            System.out.println("Enter Mark6: ");
            int m6=x.nextInt();
            Marks obj=new Marks();
            obj.sem1(m1, m2, m3);
            obj.sem2(m4, m5, m6);
            obj.calc();
        }

    }
}

