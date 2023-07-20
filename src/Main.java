import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the amount you would like to withdraw from the ATM (between 1000 and 250000): ");
        int[] banknote = {20000, 10000, 5000, 2000, 1000, 500};
        int amount;
        do {
            amount = sc.nextInt();
            if (amount < 1000 || amount > 250000) {
                System.out.print("I apologize for the confusion. " +
                        "Please enter the amount you would like to withdraw from the ATM within the range of 1000 and 250000.: ");
            }
        } while (amount < 1000 || amount > 250000);

        for (int i = 0; i < banknote.length; i++) {
            int db = amount / banknote[i];
            if (db > 0) {
                System.out.println(db + " db " + banknote[i]);
            }
            amount = amount - db * banknote[i];

        }
        if (amount > 0) {
            System.out.println(amount+" In this much remains inside.");
        }
    }
}