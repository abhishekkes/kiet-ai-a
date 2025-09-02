package Unit1;

import java.util.InputMismatchException;
import java.util.Scanner;

class B
{
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner sc=new Scanner(System.in);
        try
        {
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
            System.out.println(z);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}
