package org.kkk.first;

import java.util.*;
import java.util.stream.Collectors;

public class TextFromFile {
    public static Set readText(String filePath, String regex) {
        if (filePath == null || regex == null) {
            throw new NullPointerException();
        }
        List<String> textList= new ArrayList<String>();
        Scanner scanner=new Scanner(filePath);
        while (scanner.hasNextLine()){
            textList.add(scanner.nextLine());
        }

        return textList.stream()
                .flatMap(i->Arrays.stream(i.split(" ")))
                .filter(i->!i.matches(regex))
                .collect(Collectors.toCollection(HashSet::new));
    }
}
