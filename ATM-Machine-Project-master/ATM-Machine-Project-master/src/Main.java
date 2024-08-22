import java.util.*;
class ATM {
    String card;
    int secret_number = 1234;
    Scanner sc = new Scanner(System.in);
    public ATM() {
        System.out.println("***** Welcome To Our Branch *****");
    }

    public void insert_card() {
        System.out.println("We Support ICICI Bank Card.\nWe Support HDFC Bank Card.\nWe Support Axis Bank Card.");
        System.out.println("Insert Your Card");
        card = sc.next();
        switch (card) {
            case "ICICI":
            case "HDFC":
            case "Axis":
                System.out.println("Enter Your Secret Number");
                secret_number = sc.nextInt();
                if (secret_number != 1234) {
                    System.out.println("Incorrect Password Try Again");
                    break;
                }
                System.out.println("Enter Amount You want to Withdraw");
                double amount = sc.nextDouble();
                if (amount >= 20000) {
                    System.out.println("It is large amount please enter considerable amount.");
                    break;
                } else {
                    System.out.println("Collect Your Amount Rs " + amount);
                    System.out.println("Thanks For Using Our Service...Visit Again!");
                    System.out.println("*** Collect Your Card ***");
                    break;
                }
            default: {
                System.out.println("We are not Support This Bank");
                break;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.insert_card();
    }
}