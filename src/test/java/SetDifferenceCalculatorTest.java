import org.example.SetDifferenceCalculator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetDifferenceCalculatorTest {


    private final SetDifferenceCalculatorTest calculator = new SetDifferenceCalculatorTest();

    @Test
    void testCalculateDifference_EmptySets() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> expectedDifference = new HashSet<>();
        Set<Integer> actualDifference = calculator.calculateDifference(set1, set2);
        assertEquals(expectedDifference, actualDifference);
        System.out.println("Test 1: Empty sets - Passed");
    }

    @Test
    void testCalculateDifference_Set1ContainsAllElementsOfSet2() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2));
        Set<Integer> expectedDifference = new HashSet<>(Set.of(3));
        Set<Integer> actualDifference = calculator.calculateDifference(set1, set2);
        assertEquals(expectedDifference, actualDifference);
        System.out.println("Test 2: Set1 contains all elements of Set2 - Passed");
    }

    @Test
    void testCalculateDifference_Set2ContainsAllElementsOfSet1() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> expectedDifference = new HashSet<>();
        Set<Integer> actualDifference = calculator.calculateDifference(set1, set2);
        assertEquals(expectedDifference, actualDifference);
        System.out.println("Test 3: Set2 contains all elements of Set1 - Passed");
    }

    @Test
    void testCalculateDifference_NoCommonElements() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4));
        Set<Integer> expectedDifference = new HashSet<>(Set.of(1, 2));
        Set<Integer> actualDifference = calculator.calculateDifference(set1, set2);
        assertEquals(expectedDifference, actualDifference);
        System.out.println("Test 4: No common elements - Passed");
    }

    @Test
    void testCalculateDifference_PartialOverlap() {
        SetDifferenceCalculator calculator = new SetDifferenceCalculator();
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Set.of(2, 4, 5));
        Set<Integer> expectedDifference = new HashSet<>(Set.of(1, 3));
        Set<Integer> actualDifference = calculator.calculateDifference(set1, set2);
        assertEquals(expectedDifference, actualDifference);
        System.out.println("Test 5: Partial overlap - Passed");
    }
}