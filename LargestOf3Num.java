import java.util.Scanner;

class LargestOf3Num{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter String 1: ");
Integer n1 = Integer.valueOf(sc.nextLine());

System.out.println("Enter String 2: ");
Integer n2 = Integer.valueOf(sc.nextLine());

System.out.println("Enter String 3: ");
Integer n3 = Integer.valueOf(sc.nextLine());

Integer largest = n1;

if (n2 > largest){
largest = n2;   }

if (n3 > largest){
largest = n3;   }

System.out.println("Largest: " + largest);
sc.close();

}}

