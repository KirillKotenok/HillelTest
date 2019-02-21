package org.kkk.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class TextFromFileTest {

    @Test
    public static void test() {
        String url = "/home/kirillk/IdeaProjects/testHillel/src/main/resources/text";
        String regex = ".,/;:";

        Set readText=TextFromFile.readText(url, regex);

        assertEquals(readText, TextFromFile.readText(url, regex));

    }
}