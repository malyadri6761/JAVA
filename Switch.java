import java.util.*;

public class Switch{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Ente the day as number : ");
        int val=obj.nextInt();
        switch(val){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("Thursday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Saturday");
                    break;
            default:
                    System.out.println("The days are only 7.\n Please choose correct day.");
                    break;
                    
        }

    }
}