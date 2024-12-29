import java.util.Scanner;
public class javatest2 {
    public static void main(String[] args) {
        int num1=-10;
        if (num1>0) {
            System.out.println("given number is postive");
            
        }
        else if (num1<0) {
            System.out.println("given number is negative");
            
        }
        else {
            System.out.println("given number is zero");

        }
        // second test 
        int num2=30;
        int num3=20;
        int num4=40;
        if (num2>num3) {
          System.out.println("num2 is maximum"+num2);  
        }
        else if (num3>num4) {
           System.out.println("num3 is maximum"+num3); 
        }
        else{
            System.out.println("num4 is maximum"+num4);

        }
        // test three
        Scanner num= new Scanner(System.in);
        System.out.println("enter a number ");
        int num5=num.nextInt();



        if (num5%5==0) {
System.out.println("enter number is divisiable by 5");
            
        }
        else if (num5%11==0) {
            System.out.println("enter number is divisable by 11");
            
        }
        else{
            System.out.println("enter number is not divisable");

        }
        // four test
        int num6=10;
        if (num6%2==0) {
            System.out.println("it a even number ");
        }
        else if (num6%2==0) {
           System.out.println("it a odd number "); 
        }
        else{
            System.out.println("it a ivalid number");

        }



    }
    

    
}
