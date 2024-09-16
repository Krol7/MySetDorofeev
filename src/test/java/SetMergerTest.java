import org.example.SetMerger;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetMergerTest {

    @Test
    void testMergeSetsWithIntersection() {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of(3, 4, 5, 6);
        SetMerger merger = new SetMerger();
        Set<Integer> mergedSet = merger.mergeSets(set1, set2);
        System.out.println("Merged set (with intersection): " + mergedSet);
        assertEquals(Set.of(1, 2, 3, 4, 5, 6), mergedSet);
    }

    @Test
    void testMergeSetsWithoutIntersection() {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of(5, 6, 7, 8);
        SetMerger merger = new SetMerger();
        Set<Integer> mergedSet = merger.mergeSets(set1, set2);
        System.out.println("Merged set (without intersection): " + mergedSet);
        assertEquals(Set.of(1, 2, 3, 4, 5, 6, 7, 8), mergedSet);
    }

    @Test
    void testMergeSetsWithEmptySet1() {
        Set<Integer> set1 = Set.of();
        Set<Integer> set2 = Set.of(1, 2, 3, 4);
        SetMerger merger = new SetMerger();
        Set<Integer> mergedSet = merger.mergeSets(set1, set2);
        System.out.println("Merged set (empty set1): " + mergedSet);
        assertEquals(Set.of(1, 2, 3, 4), mergedSet);
    }

    @Test
    void testMergeSetsWithEmptySet2() {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of();
        SetMerger merger = new SetMerger();
        Set<Integer> mergedSet = merger.mergeSets(set1, set2);
        System.out.println("Merged set (empty set2): " + mergedSet);
        assertEquals(Set.of(1, 2, 3, 4), mergedSet);
    }

    @Test
    void testMergeSetsWithEqualSets() {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of(1, 2, 3, 4);
        SetMerger merger = new SetMerger();
        Set<Integer> mergedSet = merger.mergeSets(set1, set2);
        System.out.println("Merged set (equal sets): " + mergedSet);
        assertEquals(Set.of(1, 2, 3, 4), mergedSet);
    }
}