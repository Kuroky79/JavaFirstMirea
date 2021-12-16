package ru.mirea.task26;

import java.util.Scanner;

interface Payment { public void pay(String product); }

class Wallet implements Payment {
    public void pay(String product) {
        System.out.println("Thank you for purchase!");
        System.out.println("Your order has been paid by eWallet!");
    }
}

class Credit implements Payment {
    public void pay(String product) {
        System.out.println("Thank you for purchase! Your order has been paid by a credit card");
    }
}

class Shop {
    String item, electrWallet;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Input item that u would like to buy:");

        item = sc.nextLine();

        System.out.print("Input your payment method: ");
        electrWallet = sc.nextLine();

        switch (electrWallet) {
            case "eWallet":
                Payment e_wallet = new Wallet();
                e_wallet.pay(item);
                break;

            case "creditCard":
                Payment credit = new Credit();
                credit.pay(item);
                break;

            default:
                System.out.println("Warning! Try to input 'eWallet' ot 'creditCard' ");
                break;
        }

        return;
    }
}