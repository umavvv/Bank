package org.example;

public class CreditCard extends BankCard {
    private final double creditLimit = 10000;
    private double creditBalance = creditLimit;
    private double balanceSave;

    @Override
    public void deposit(int amount) {
        balanceSave = amount + getBalance();
        setBalance(balanceSave);
        if (getBalance() != 0 && creditBalance < creditLimit) {
            creditBalance = creditBalance + getBalance();
            balanceSave = (creditBalance - creditLimit);
            setBalance(balanceSave);
            if (creditBalance > creditLimit) {
                creditBalance = creditBalance - getBalance();
            }
            if (getBalance() < 0) {
                balanceSave = 0;
                setBalance(balanceSave);
            }
        }
    }

    @Override
    public void pay(int amount) {
        balanceSave = getBalance() - amount;
        setBalance(balanceSave);

        if (getBalance() < 0) {
            creditBalance = getBalance() + creditLimit;
            balanceSave = 0;
            setBalance(balanceSave);
        }
    }

    @Override
    public void findBalance() {
        System.out.println(getBalance());
    }

    @Override
    public void findAllBalance() {
        System.out.println("Кредитная карта " + creditBalance);
        System.out.println("Баланс " + getBalance());
    }
}
