package com.cmpe202.individualproject.handlers;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class Visa implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public Visa() {
        nextHandler = new Amex();
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {
        String a = creditCardEntry.getCardNumber();
        String number = a.toString();
        String result = "";
        String fDigit = number.substring(0, 1);

        System.out.println(a + " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Visa");
       
        if(a.length() > 19) {
            return "Invalid: more than 19 digits";
        } else if(a.length() == 0) {
            return "Invalid: empty/null card number";
        } else if (fDigit.equals("4") && (number.length() == 13 || number.length() == 16)) {
            result = "Visa";
        } else {
            return nextHandler.checkCreditCardType(creditCardEntry);
        }
        return result;
    }
}

