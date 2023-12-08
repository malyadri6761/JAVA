import java.util.Scanner;
public class MethodOverloading{
    public static void intSum(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
    public static void intSum(double a,double b){
        System.out.println("Sum : "+(a+b));
    }
    public static void intSum(String e){
        System.out.println("My name is : "+e);
    }
    public static void main(String[] args){
        intSum(2,4);
        intSum(3.4,5.6);
        intSum("Malyadri");

    }
}