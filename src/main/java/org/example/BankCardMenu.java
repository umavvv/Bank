package org.example;

import java.util.Scanner;

public class BankCardMenu {
    DebitCard debitCard = new DebitCard();
    CreditCard creditCard = new CreditCard();

    public void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A. Оплатить Дебетовой картой");
        System.out.println("B. Пополнить Дебетовую карту");
        System.out.println("C. Баланс Дебетовой карты");
        System.out.println("D. Весь баланс на счету Дебетовой карты");
        System.out.println("a. Оплатить Кредитной картой");
        System.out.println("b. Пополнить Кредитную карту");
        System.out.println("c. Баланс Кредитной карты");
        System.out.println("d. Весь баланс на счету Кредитной карты");
        System.out.println("X. Выход");
        do {
            System.out.println("Введите опцию");
            option = scanner.next().charAt(0);
            switch (option) {
                case 'A':
                    System.out.println("Оплатить ");
                    int amount = scanner.nextInt();
                    debitCard.pay(amount);
                    break;
                case 'B':
                    System.out.println("Пополнить ");
                    int amount2 = scanner.nextInt();
                    debitCard.deposit(amount2);
                    break;
                case 'C':
                    System.out.println("Баланс ");
                    debitCard.findBalance();
                    break;
                case 'D':
                    System.out.println("Весь баланс на счету ");
                    debitCard.findAllBalance();
                    break;
                case 'a':
                    System.out.println("Оплата");
                    int amount3 = scanner.nextInt();
                    creditCard.pay(amount3);
                    break;
                case 'b':
                    System.out.println("Пополнить ");
                    int amount4 = scanner.nextInt();
                    creditCard.deposit(amount4);
                    break;
                case 'c':
                    System.out.println("Баланс ");
                    creditCard.findBalance();
                    break;
                case 'd':
                    System.out.println("Весь баланс на счету ");
                    creditCard.findAllBalance();
                    break;
                case 'X':
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Не корректное выражение");
                    break;
            }
        } while (option != 'X');
    }
}
