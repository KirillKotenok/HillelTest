package org.kkk.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class TextFromFileTest {

    @Test
    public static void test() {
        String url = "text.txt";
        String regex = ".,/;:";

        Set readText=TextFromFile.readText(url, regex);

        assertThrows(NullPointerException.class, ()-> TextFromFile.readText(url, null));

        assertEquals(readText, TextFromFile.readText(url, regex));

    }
}