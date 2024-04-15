package org.example;

import lombok.*;

@Getter
@Setter
public abstract class BankCard {
    private double balance;

    public abstract void deposit(int amount);
    public abstract void pay(int amount);
    public abstract void findBalance();
    public abstract void findAllBalance();


}
