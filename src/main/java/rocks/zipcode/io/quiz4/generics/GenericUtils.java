package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> powerSet = new LinkedHashSet<>();

        if (originalSet.isEmpty()) {
            powerSet.add(new LinkedHashSet<T>());
            return powerSet;
        }

        List<T> originalList = new ArrayList<>(originalSet);
        T head = originalList.get(0);
        Set<T> rest = new LinkedHashSet<T>(originalList.subList(1, originalList.size()));
        for (Iterable<T> i : powerSet( rest)) {
            Set<T> newSet = new HashSet<T>();
            for (T t : i) {
                newSet.add(t);
            }
            powerSet.add(newSet);

            newSet.add(head);
            powerSet.add(newSet);
        }
        return powerSet;
    }


    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

