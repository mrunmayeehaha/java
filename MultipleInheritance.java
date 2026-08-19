import java.util.Scanner;

interface FY {
    void acceptFY(Scanner sc);
    void displayFY();
}

interface SY {
    void acceptSY(Scanner sc);
    void displaySY();
}

class Student implements FY, SY {
    int fyRollNo, syRollNo;
    String fyName, syName;
    String fyResult, syResult;

    public void acceptFY(Scanner sc) {
        System.out.print("Enter FY Roll No: ");
        fyRollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter FY Name: ");
        fyName = sc.nextLine();

        System.out.print("Enter FY Result: ");
        fyResult = sc.nextLine();
    }

    public void displayFY() {
        System.out.println("FY Roll No: " + fyRollNo);
        System.out.println("FY Name: " + fyName);
        System.out.println("FY Result: " + fyResult);
    }

    public void acceptSY(Scanner sc) {
        System.out.print("Enter SY Roll No: ");
        syRollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter SY Name: ");
        syName = sc.nextLine();

        System.out.print("Enter SY Result: ");
        syResult = sc.nextLine();
    }

    public void displaySY() {
        System.out.println("SY Roll No: " + syRollNo);
        System.out.println("SY Name: " + syName);
        System.out.println("SY Result: " + syResult);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("--- Enter FY Data ---");
        s.acceptFY(sc);

        System.out.println("\n--- Enter SY Data ---");
        s.acceptSY(sc);

        System.out.println("\n--- FY Details ---");
        s.displayFY();

        System.out.println("\n--- SY Details ---");
        s.displaySY();

        sc.close();
    }
}