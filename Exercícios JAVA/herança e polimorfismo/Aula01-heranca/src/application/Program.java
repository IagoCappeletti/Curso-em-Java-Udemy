package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1021, "Anna", 1000.0, 0.01);

        /*O que é polimosfismo?
         A mesma operação em váriaveis do mesmo tipo Account, mas eles tiveram comportamentos diferentes conforme
         os objetos as quais elas apontam*/

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
