import java.util.Scanner;

class Concatenate{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter firstname: ");
String fname = sc.nextLine();

System.out.println("Enter lastname: ");
String lname = sc.nextLine();

String res = fname + " " + lname;

System.out.println("Concatenated String: " + res);
}}

