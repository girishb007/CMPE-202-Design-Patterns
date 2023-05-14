package com.cmpe202.individualproject.handlers;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class Discover implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public Discover() {
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {

        String a = creditCardEntry.getCardNumber();
        String number = a.toString();
        String result = "";
        String fourDigit = number.substring(0, 4);
        int sDigit = Integer.parseInt(number.substring(1, 2));
        System.out.println(a + " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Discover");

        if(a.length() > 16) {
            result = "Invalid: more than 19 digits";
        } else if(!a.matches("[0-9]+")) {
            result = "Invalid: non numeric characters";
        } else if(a.equals("") || a.length() == 0) {
            result = "Invalid: empty/null card number";
        }else if (fourDigit.equals("6011") && number.length() == 16) {
            result = "Discover";
        } else {
            result = "Invalid: Not a possible card";
        }
        return result;
    }
}
