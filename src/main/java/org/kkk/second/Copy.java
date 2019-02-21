package org.kkk.second;

import java.util.Arrays;
import java.util.Collection;

public class Copy<T> {

    private Collection<T> copyArrInCollection(T[] array, Collection<T> collection) {
        if (array != null && collection != null) {
            collection.addAll(Arrays.asList(array));
            return collection;
        }else throw new NullPointerException();
    }
}
