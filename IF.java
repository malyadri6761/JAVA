import java.util.*;
public class IF{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value  : ");
        int num=obj.nextInt();

        if(num<0)
            System.out.println("Negative number");
        else if(num>0)
            System.out.println("Positive number");
        else    
            System.out.println("Zero");

    }
}