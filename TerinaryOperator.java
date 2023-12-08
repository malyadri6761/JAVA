import java.util.*;
public class TerinaryOperator{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value :");
        int num=obj.nextInt();
        String result=(num>=18? "Your Eligible for Voting":"Your not Eligible for Voting");
        System.out.println(result);
    }
}