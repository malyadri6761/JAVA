import java.util.*;
public class arrayPassingMethod {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < 5; i++){
            arr[i] = obj.nextInt();
        }
        int total=sum(arr);
        System.out.print("The sum of the array numbers is : "+total);

    }
    public static int sum(int [] array){
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=array[i];
        }
        return sum;
    }
}
