package org.kkk.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class TextFromFile {

    public static ArrayList<String> readText(String filePath, String regex) throws FileNotFoundException {

        if (filePath == null || regex == null) {
            throw new NullPointerException();
        }
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);
        List<String> textList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            textList.add(scanner.nextLine().toLowerCase());
        }

        return textList.stream()
                .flatMap(i -> Arrays.stream(i.split(" ")))
                .filter(i -> !i.matches(regex))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
