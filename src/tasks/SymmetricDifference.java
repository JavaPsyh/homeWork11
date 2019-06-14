package tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class SymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> linkdHashSet = new LinkedHashSet<>(set1);
        System.out.println(GetCallerClassAndMethodName.getCallerClassAndMethodName());
        for (T value : set2) {
            if (linkdHashSet.contains(value)) {
                linkdHashSet.remove(value);
            } else {
                linkdHashSet.add(value);
            }
        }
        return linkdHashSet;
    }
}
