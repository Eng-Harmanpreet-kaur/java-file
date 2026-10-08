import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMaxUtilTest {
    
    private FindMaxUtil findMaxUtil = new FindMaxUtil();

    // TEST 1: Normal case - array with multiple elements
    @Test
    public void testFindMaxWithNormalValues() {
        int[] arr = {3, 7, 2, 9, 1};
        int result = findMaxUtil.findMax(arr);
        assertEquals(9, result, "Should return the maximum value 9 from the array");
    }

    // TEST 2: Array with only one element
    @Test
    public void testFindMaxWithSingleElement() {
        int[] arr = {42};
        int result = findMaxUtil.findMax(arr);
        assertEquals(42, result, "Should return the only element as the maximum");
    }

    // TEST 3: Array with all positive numbers
    @Test
    public void testFindMaxWithAllPositiveNumbers() {
        int[] arr = {10, 20, 30, 40, 50};
        int result = findMaxUtil.findMax(arr);
        assertEquals(50, result, "Should return the largest positive number");
    }

    // TEST 4: Array with negative numbers
    @Test
    public void testFindMaxWithNegativeNumbers() {
        int[] arr = {-5, -1, -10, -3};
        int result = findMaxUtil.findMax(arr);
        assertEquals(-1, result, "Should return -1 as the maximum among negative numbers");
    }

    // TEST 5: Array with mixed positive and negative numbers
    @Test
    public void testFindMaxWithMixedPositiveAndNegative() {
        int[] arr = {-8, 4, -2, 15, 0, 7};
        int result = findMaxUtil.findMax(arr);
        assertEquals(15, result, "Should return 15 as the maximum");
    }

    // TEST 6: Array with duplicate maximum values
    @Test
    public void testFindMaxWithDuplicateValues() {
        int[] arr = {5, 9, 3, 9, 2};
        int result = findMaxUtil.findMax(arr);
        assertEquals(9, result, "Should return 9 even if it appears multiple times");
    }

    // TEST 7: Array where maximum is at the beginning
    @Test
    public void testFindMaxWithMaxAtBeginning() {
        int[] arr = {100, 50, 30, 10};
        int result = findMaxUtil.findMax(arr);
        assertEquals(100, result, "Should correctly identify max when it's at the beginning");
    }

    // TEST 8: Array where maximum is at the end
    @Test
    public void testFindMaxWithMaxAtEnd() {
        int[] arr = {10, 20, 30, 100};
        int result = findMaxUtil.findMax(arr);
        assertEquals(100, result, "Should correctly identify max when it's at the end");
    }

    // TEST 9: Empty array - should throw NullPointerException
    @Test
    public void testFindMaxWithEmptyArray() {
        int[] arr = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, 
            () -> findMaxUtil.findMax(arr),
            "Should throw ArrayIndexOutOfBoundsException for empty array");
    }

    // TEST 10: Null array - should throw NullPointerException
    @Test
    public void testFindMaxWithNullArray() {
        int[] arr = null;
        assertThrows(NullPointerException.class, 
            () -> findMaxUtil.findMax(arr),
            "Should throw NullPointerException for null array");
    }
}
