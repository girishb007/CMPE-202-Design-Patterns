package com.cmpe202.individualproject.handlers;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class Amex implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public Amex() {
        nextHandler = new Discover();
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {
        String a = creditCardEntry.getCardNumber();
        String number = a.toString();
        String result = "";
        String fDigit = number.substring(0, 1);
        int sDigit = Integer.parseInt(number.substring(1, 2));
        System.out.println(a + " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Amex");


        if (fDigit.equals("3") && number.length() == 15 && (sDigit == 4 || sDigit == 7)) {
            result = "AmericanExpress";
        } else {
            return nextHandler.checkCreditCardType(creditCardEntry);
        }
        return result;
    }
}
