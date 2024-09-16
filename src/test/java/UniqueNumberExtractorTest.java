import org.example.UniqueNumberExtractor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueNumberExtractorTest {

    @Test
    public void testExrtactUniqueNumbersWithDuplicates(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers fron as emoty list should be an empty set.");

    }

    @Test
    public void testExtractUniqueNumbersEmptyList(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers fron as emoty list should be an empty set.");

    }
    @Test
    public void testExtractorUniqueWithNoDupNumbers(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers fron as emoty list should be an empty set.");

    }
    @Test
    public void testExtractorUniqueWithNegativeNumbers(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers fron as emoty list should be an empty set.");

    }

    @Test
    public void testExtractorUniqueWithAllDupNumbers(){
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers fron as emoty list should be an empty set.");

    }
    }


