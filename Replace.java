import java.util.Scanner;
class Replace{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter String: ");
String str = sc.nextLine();

System.out.println("Enter index: ");
Int index = sc.nextInt();

System.out.println("Enter char to replace: ");
String ch = sc. nextLine().charAt(0);

StringBuilder sb = new StringBuilder(str);
sb.setCharAt(index, ch);

System.out.println("Updated string: " + sb.toString());
sc.close();

