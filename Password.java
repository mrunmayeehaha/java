import java.util.Scanner;
class Password{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String setPassword = "java123";
System.out.println("Enter password:");
String userPassword = sc.nextLine();
if(userPassword.equals(setPassword)){
System.out.println("Correct Password");
} else {
System.out.println("wrong Password");
}
}
}