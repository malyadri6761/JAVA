import java.util.*;

public class Array{
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        for(int i:a){
            System.out.println(i);
        }

        int[][] arr={{1,2},{3,4}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        } 
    }
}