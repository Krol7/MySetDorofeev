package org.example;
import java.util.HashSet;
import java.util.Set;

public class SetDifferenceCalculator {
    public Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;

    }
}

