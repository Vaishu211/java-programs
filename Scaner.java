import java.util.Scanner;
class Scaner{
    public static void main(String[] args){
        Scanner hello = new Scanner(System.in);
        System.out.println("enter the number1");
        int number1 = hello.nextInt();
        System.out.println("enter the number2");
        int number2= hello.nextInt();
        int output = number1+number2;
        System.out.println(output);
    }
}