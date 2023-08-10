package company;
import java.util.Optional;
import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int x = sc.nextInt();
        System.out.println("enter the second number:");
        int y = sc.nextInt();
        System.out.println("enter the third number:");
        int z = sc.nextInt();
        int arg2 = c.add(x,y);
        System.out.println("addition of two numbers :" + arg2);
        int arg3 = c.add(x,y,z);
        System.out.println("addition of three numbers :" + arg3);
    }
}
class Calculator{
    int add(int x,int y)
    {
        int z;
        z= x+ y;
        return z;
    }
    int add(int x,int y,int z)
    {
        int a;
        a= x+y+z;
        return a;
    }

}