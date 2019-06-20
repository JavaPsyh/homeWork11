package tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class SymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> linkedHashSet = new LinkedHashSet<>(set1);
        for (T value : set2) {
            if (linkedHashSet.contains(value)) {
                linkedHashSet.remove(value);
            } else {
                linkedHashSet.add(value);
            }
        }
        return linkedHashSet;
    }
}
