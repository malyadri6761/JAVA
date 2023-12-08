public class Logical{
    public static void main(String[] args){
        int num1=23;
        int num2=45;
        if(num1==23 && num2<23){
            System.out.println("and Condition");
        }
        else if(num1==23 || num2<23){
            System.out.println("or Condition");
        }

        //not condition apply on boolean values
        else if(!(num1==23 && num2<23)){
            System.out.println("not Condition");
        }
    }
}