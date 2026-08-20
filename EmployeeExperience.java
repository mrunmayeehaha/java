import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeExperience {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter joining date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate joiningDate =
                LocalDate.parse(inputDate, formatter);

        LocalDate today = LocalDate.now();

        Period experience =
                Period.between(joiningDate, today);

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Joining Date: " +
                joiningDate.format(formatter));

        System.out.println("Today's Date: " +
                today.format(formatter));

        System.out.println("Work Experience: "
                + experience.getYears() + " years, "
                + experience.getMonths() + " months, "
                + experience.getDays() + " days");

        sc.close();
    }
}