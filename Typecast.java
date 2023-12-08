public class Typecast{
    public static void main(String[] args){
        //Wide cast
        int num1=10;
        double f=num1;
        System.out.println("Widecasting : "+f);

        //Narrow cast
        double d1=20.34d;
        int num2=(int)d1;
        System.out.println("Narrowcasting : "+num2);
    }
}