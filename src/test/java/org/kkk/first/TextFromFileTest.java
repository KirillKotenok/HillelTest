package org.kkk.first;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TextFromFileTest {

    @Test
    public void testReadDataWithoutSymbols() throws FileNotFoundException{
        String url = "/home/kirillk/IdeaProjects/testHillel/src/main/resources/text";
        String regex = ",|.|/|;|:|`";
        String reference = " hello java i`m kirill hello java am kirill ";
        List<String> readText = TextFromFile.readText(url, regex);

        String buff = " ";

        for (String a : readText) {
            buff += a;
            buff += " ";
        }

        assertEquals(reference, buff);
    }

    @Test
    public void readTextWithFakeDataTest() {

        String url = "text.txt";

        assertThrows(NullPointerException.class, () -> TextFromFile.readText(url, null));
    }
}