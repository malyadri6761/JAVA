import java.util.*;
public class UserInput{
    public static void main(String[] args){

        
        //Defining Scanner object                                             //Callin Scanner object
        Scanner obj=new Scanner(System.in);
                                                                              //obj.nextByte()      
        System.out.print("Enter the Integer : ");                           //obj.nextShort()
        int a=obj.nextInt();                                                  //obj.nextInt()
        System.out.println(a);                                                //obj.nextLong()
                                                                              //obj.nextFloat()
        System.out.print("Enter the Float : ");                              //obj.nextDouble()
        float b=obj.nextInt();                                                //obj.nextBoolean()
        System.out.println(b);

        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String c=obj1.nextLine();
        System.out.println(c);
    }
}