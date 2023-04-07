package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 00.1));
        list.add(new BusinessAccount(1002, "Anna", 1000.0, 200.0));
        list.add(new SavingsAccount(1003, "iago", 300.0, 00.1));
        list.add(new SavingsAccount(1004, "Ana", 640.0, 00.1));
        list.add(new BusinessAccount(1005, "Pedro", 900.0, 400.0));

        double sum = 0.0;
        for (Account account : list){
            sum += account.getBalance();
        }
        System.out.printf("Total saldos: %.2f%n", sum);

        for (Account account : list){
            account.deposit(10.0);
        }
        for (Account account : list){
            System.out.printf("Update balance for account %d: %.2f%n", account.getNumber(), account.getBalance());
        }
    }
}
