import java.util.Scanner;
class javatest2{
    public static void main(String[] args) {
       System.out.println("hello world");
       Scanner umber1= new Scanner(System.in);
       System.out.println("enter a number ");
       int number1=umber1.nextInt();
       Scanner umber2= new Scanner(System.in);
       System.out.println("enter a last n number");
       int number2=umber2.nextInt();
       while (number1<number2) {
        System.out.println("sum of natural number are "+number1);
        ++number1;
       }  
       // sum of java code
       Scanner nmber1= new Scanner(System.in);
       System.out.println("enter a number ");
       int number3=umber1.nextInt();
       Scanner nmber2= new Scanner(System.in);
       System.out.println("enter a last n number");
       int number4=umber2.nextInt();
       while (number3<number4) {
        System.out.println("sum of natural number are "+number4);
        number4--;

}
}
}
