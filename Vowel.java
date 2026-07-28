import java.util.Scanner;
class Vowel{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String");
String str = sc.nextLine();
int vowel = 0;
for(int i = 0;i<str.length();i++){
char ch = Character.toLowerCase(str.charAt(i));
if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
vowel++;
}
}
System.out.println("Number of vowel:"+vowel);
}
}