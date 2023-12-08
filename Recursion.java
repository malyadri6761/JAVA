import java.util.*;
public class Recursion{
    public static int Factorial(int a){
        if(a==0)
            return 1;
        else
        {
            return a*Factorial(a-1);
        }
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=obj.nextInt();
        System.out.print("Factorial of "+a+"number is : "+Factorial(a));
    }
}