import java.util.Scanner;

public class Main {
    static void main() {
        //This is where we will test InputHelper methods
        Scanner scan = new Scanner(System.in);
        String name = InputHelper.getNonZeroLenString(scan,"Please enter your name.");
        String atSchool = InputHelper.getYNConfirm(scan,"Are you at school?");
        int age = InputHelper.getInt(scan, "Please enter your age.");
        double favoriteDecimal = InputHelper.getDouble(scan, "What's your favorite decimal number?");
        int rangedInt = InputHelper.getRangedInt(scan, "Please enter an integer between 0 and 20.", 0, 20);
        double rangedDouble = InputHelper.getRangedDouble(scan, "Please enter a number between 0 and 20.", 0, 20);
        int nonZeroInt = InputHelper.getPositiveNonZeroInt(scan, "Please enter an integer greater than 0.");
        System.out.println("Hello, " + name + "!");
        System.out.println("Are you at school? " + atSchool);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite decimal number: " + favoriteDecimal);
        System.out.println("An integer between 0 and 20: " + rangedInt);
        System.out.println("A decimal number between 0 and 20: " + rangedDouble);
        System.out.println("An integer above 0: " + nonZeroInt);

        String phoneNum = InputHelper.getRegExString(scan, "Enter your phone number [xxx-xxx-xxxx]", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println("Phone number: " + phoneNum);

        String bday = InputHelper.getRegExString(scan, "Enter your birthday [mm/dd/yyyy]", "\\d{2}/\\d{2}/\\d{4}");
        System.out.println("Birthday: " + bday);
    }
}
