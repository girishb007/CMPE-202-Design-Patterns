package com.cmpe202.individualproject.handlers;

import com.cmpe202.individualproject.main.CreditCardEntry;

public class MasterCard implements CreditCardHandler {
    CreditCardHandler nextHandler;

    public MasterCard() {
        nextHandler = new Visa();
    }

    @Override
    public String checkCreditCardType(CreditCardEntry creditCardEntry) {
        String a = creditCardEntry.getCardNumber();
        String number = a.toString();
        String result = "";
        System.out.println(a + " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ MC" + number + " " + a.length());
        
        if(a.equalsIgnoreCase("null")) {
            return "Invalid: No Card Number";
         } else if(a.length() > 19) {
            return "Invalid: more than 19 digits";
        } else if(a.length() == 0) {
            return "Invalid: empty/null card number";
        }  else if(!a.matches("[0-9]+")) {
            return "Invalid: non numeric characters";
         } else if (number.length() <= 19 && number.length() > 0) {
            String fDigit = number.substring(0, 1);
            int sDigit = Integer.parseInt(number.substring(1, 2));
            if (fDigit.equals("5") && sDigit >= 1 && sDigit <= 5 && number.length() == 16) {
                result = "MasterCard";
            } else {
                return nextHandler.checkCreditCardType(creditCardEntry);
            }
        } else {
            System.out.println("Invalid card type!");
        }
        return result;
    }
}
