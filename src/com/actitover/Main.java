package com.actitover;

import com.actitover.abstraction.MailService;
import com.actitover.encapsulation.Account;
import com.actitover.interfaces.TaxCalc2020;
import com.actitover.interfaces.TaxCalculator;

public class Main {

    public static void main(String[] args) {
        User user = new User("Tito");
        user.sayHello();

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        var account = new Account();
        account.deposit(20);
        account.withdraw(5);
        System.out.println(account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalc2020();
    }
}
