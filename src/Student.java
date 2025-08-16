import java.sql.SQLOutput;

public class Student {
    int roll_no;
    public String name;
    static String sec="AI-A";
    Student()
    {

    }
    Student(int r,String n)
    {
        int id=0;
        System.out.println(id);
        name=n;
        roll_no=r;
    }
    Student(Student s)
    {
        name=s.name;
        roll_no=s.roll_no;

    }
    void display()
    {

        System.out.println("Name is "+name);
        System.out.println("Roll NUmber is "+roll_no);
    }

}
