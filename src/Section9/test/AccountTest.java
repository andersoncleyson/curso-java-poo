package Section9.test;

import Section9.domain.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.printf("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposist (y/n)? ");
        String answer = sc.next();
        char choice = answer.charAt(0);

        double depositValue;

        Account account;

        if (choice == 'y') {
            System.out.printf("Enter initial deposit value: ");
            depositValue = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, depositValue);
        } else {
            account = new Account(accountNumber, accountHolder);
        }
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withDraw = sc.nextDouble();
        account.withdraw(withDraw);
        System.out.println(account);

        sc.close();
    }
}
