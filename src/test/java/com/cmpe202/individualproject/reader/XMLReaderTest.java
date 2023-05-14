package com.cmpe202.individualproject.reader;

import com.cmpe202.individualproject.main.CreditCardEntry;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class XMLReaderTest {
    @Test
    void checkReadXml() {
        XMLReader xmlReaderObj = new XMLReader();
        String filePath = "src/test/java/sampleFiles/input_file.xml";
        List<CreditCardEntry> result = xmlReaderObj.readFile(filePath);
        String name = result.get(0).getNameOfCardholder();
        String cardNumber = result.get(0).getCardNumber();
        Assert.assertEquals(name, "John DoE");
        Assert.assertTrue(result.size() == 12);
        Assert.assertEquals(cardNumber, "5567894523129089");
    }
}