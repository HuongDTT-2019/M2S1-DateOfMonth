import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String daysIsMonth;
        switch (month) {
            case 2:
                daysIsMonth = " 28 or 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysIsMonth = "31 ";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysIsMonth = " 30 ";
                break;
            default:
                daysIsMonth = "";
        }
        if (daysIsMonth != "") {
            System.out.printf("The month '%d' has %s days!", month, daysIsMonth);
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
