import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return days[month - 1];
        }
    }

    public static void displayCalendar(int month, int year) {
        int daysInMonth = getDaysInMonth(month, year);

        System.out.println("=================================");
        System.out.printf("         %02d - %d\n", month, year);
        System.out.println(" SUN MON TUE WED THU FRI SAT");

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);  // months are 0-based

        int startingDay = cal.get(Calendar.DAY_OF_WEEK); // Sunday = 1

        for (int i = 1; i < startingDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((startingDay + day - 1) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my calendar!");

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month input. Please enter between 1 and 12.");
            return;
        }

        if (year < 0) {
            System.out.println("Invalid year input. Please enter a non-negative number.");
            return;
        }

        displayCalendar(month, year);
    }
}
