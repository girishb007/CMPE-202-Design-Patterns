package com.cmpe202.individualproject.handlers;

import com.cmpe202.individualproject.main.CreditCardEntry;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class VisaTest {
    @Test
    void checkValidVisa() {
        String cardNumber = "4120000000000";
        LocalDate expDate = LocalDate.of(2030, 3, 20);
        String name = "Bob";
        CreditCardEntry creditCardEntry = new CreditCardEntry(cardNumber, name);
        Visa visaObj = new Visa();
        String result = visaObj.checkCreditCardType(creditCardEntry);
        Assertions.assertEquals(result, "Visa");
    }
    @Test
    void checkInvalidVisa() {
        String cardNumber = "6011000000000000";
        LocalDate expDate = LocalDate.of(2030, 3, 20);
        String name = "Bob";
        CreditCardEntry creditCardEntry = new CreditCardEntry(cardNumber, name);
        Visa visaObj = new Visa();
        String result = visaObj.checkCreditCardType(creditCardEntry);
        Assertions.assertNotEquals(result, "Visa");
    }

}