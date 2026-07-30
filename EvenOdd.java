import java.util.Scanner;

class EvenOdd{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter String 1: ");
String str1 = sc.nextLine();
System.out.println("Enter String 1: ");
String str2 = sc.nextLine();

Integer num1 = Integer.valueOf(str1);
Integer num2 = Integer.valueOf(str2);

Integer sum = num1 + num2;

if (sum % 2 == 0){
System.out.println("Even");  }
else
System.out.println("Odd");

}}
