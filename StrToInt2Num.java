import java.util.Scanner;

class StrToInt2Num{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter String 1: ");
String str1 = sc.nextLine();

System.out.println("Enter String 2: ");
String str2 = sc.nextLine();

Integer num1 = Integer.valueOf(str1);
Integer num2 = Integer.valueOf(str2);

System.out.println("Sum: " + (num1 + num2));
}}