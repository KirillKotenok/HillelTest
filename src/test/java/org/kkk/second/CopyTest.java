package org.kkk.second;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class CopyTest {

    @Test
    public static void test() {
        Copy copy = new Copy();
        Random r = new Random();

        Integer arrI[] = new Integer[10];
        String arrS[] = new String[10];

        for (int i = 0; i < arrI.length; i++) {
            arrI[i] = r.nextInt();
        }

        for (int i = 0; i < arrS.length; i++) {
            arrS[i] = (UUID.randomUUID().toString());
        }


        Collection<String> exceptionStringColl = null;
        assertThrows(NullPointerException.class, () -> copy.copyArrInCollection(arrS, exceptionStringColl));

        Collection<String> stringColl = new ArrayList<>();
        Collection<String> collectionFromArrS=copy.copyArrInCollection(arrS, stringColl);

        Collection<String> exceptionIntColl = null;
        assertThrows(NullPointerException.class, () -> copy.copyArrInCollection(arrS, exceptionIntColl));

        Collection <Integer> intColl= new ArrayList<>();
        Collection<String> collectionFromArrI=copy.copyArrInCollection(arrS, intColl);

        assertNotNull(collectionFromArrS);

        assertNotNull(collectionFromArrI);
    }
}
