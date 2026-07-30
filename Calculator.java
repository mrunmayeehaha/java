import java.util.Scanner;
class Calculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
Integer n1 = Integer.valueOf(sc.nextLine());

System.out.print("Enter second number: ");
Integer n2 = Integer.valueOf(sc.nextLine());

System.out.print("Enter operation (+, -, *, /): ");
char op = sc.next().charAt(0);

switch (op) {
case '+':
System.out.println("Result = " + (n1 + n2));
 break;

case '-':
 System.out.println("Result = " + (n1 - n2));
break;

 case '*':
System.out.println("Result = " + (n1 * n2));
break;

case '/':
 if (n2 != 0)
 System.out.println("Result = " + (n1 / n2));
else
 System.out.println("Cannot divide by zero.");
 break;

default:
 System.out.println("Invalid Operation");
        }

        sc.close();
    }
}