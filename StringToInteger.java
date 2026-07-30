import java.util.Scanner;

class StringToInteger {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter String: ");
String str = sc.nextLine();

Integer num = Integer.valueOf(str);

System.out.println("Original String: " + str);
System.out.println("Wrapper Object: " + num);
System.out.println("Primitive value: " + num.intValue());

sc.close(); 
}  }