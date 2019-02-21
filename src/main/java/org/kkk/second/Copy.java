package org.kkk.second;

import org.kkk.first.TextFromFile;

import java.util.Arrays;
import java.util.Collection;

public class Copy<T> {

    public Collection<T> copyArrInCollection( T [] array, Collection<T> collection) {

        if (array != null && collection != null) {
            collection.addAll(Arrays.asList(array));
            return collection;
        }else throw new NullPointerException();
    }
}
