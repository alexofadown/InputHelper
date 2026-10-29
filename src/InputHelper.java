import java.util.Scanner; // no need to build a scanner but it needs to know what we're talking about when we say scanner

public class InputHelper {
    //All methods should be public and static
    //describe methods for future use
    public static String getNonZeroLenString(Scanner scan, String prompt) {

        String s;
        boolean valid = false;
        System.out.println(prompt);
        do {
            s = scan.nextLine();
            if (s.length() > 0) {
                valid = true;
            } else {
                System.out.println("Error: Please try again. You entered a string of length 0.");
            }
        } while (!valid);
        return s;
    }

    public static String getYNConfirm(Scanner scan, String prompt) {

        String yn;
        boolean valid = false;
        System.out.println(prompt);
        do {
            yn = scan.nextLine();
            if (!yn.equalsIgnoreCase("Y") && !yn.equalsIgnoreCase("N")) {
                System.out.println("Error: Please try again. You entered a string other than Y or N.");
            } else {
                valid = true;
            }
        } while (!valid);
        return yn;
    }

    public static int getInt(Scanner scan, String prompt) {

        int x = 67;
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: Please try again. You must enter an integer value.");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static double getDouble(Scanner scan, String prompt) {

        double x = 6.7;
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Error: Please try again. You must enter a decimal/integer.");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static int getRangedInt(Scanner scan, String prompt, int lowEnd, int highEnd) {

        int x;
        boolean valid = false;
        do {
            x = getInt(scan, prompt);
            if (x >= lowEnd && x <= highEnd) {
                valid = true;
            }
            else {
                System.out.println("Error: Please try again. You must enter an integer within the range.");
            }
        } while (!valid);
        return x;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double lowEnd, double highEnd) {

        double x;
        boolean valid = false;
        do {
            x = getDouble(scan, prompt);
            if (x >= lowEnd && x <= highEnd) {
                valid = true;
            }
            else {
                System.out.println("Error: Please try again. You must enter a value within the range.");
            }
        } while (!valid);
        return x;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {

        int x;
        boolean valid = false;
        do {
            x = getInt(scan, prompt);
            if (x > 0) {
                valid = true;
            }
            else {
                System.out.println("Error: Please try again. You must enter an integer greater than zero.");
            }
        } while (!valid);
        return x;
    }

}


//reminder that number after string is the bad one not string after number