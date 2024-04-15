package org.example;

public class DebitCard extends BankCard {

    @Override
    public void deposit(int amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void pay(int amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Не достаточно средств для вывода! ");
        }
    }

    @Override
    public void findBalance() {
        System.out.println(getBalance());
    }

    @Override
    public void findAllBalance() {
        System.out.println(getBalance());
    }
}
