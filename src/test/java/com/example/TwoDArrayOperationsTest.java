package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoDArrayOperationsTest {

    @Test
    void testFindMaximumValue() {
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(9, TwoDArrayOperations.findMaximumValue(testArray));
    }

    @Test
    void testContainsValue() {
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(TwoDArrayOperations.containsValue(testArray, 5));
        assertFalse(TwoDArrayOperations.containsValue(testArray, 10));
    }

    @Test
    void testCalculateAverage() {
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(5.0, TwoDArrayOperations.calculateAverage(testArray));
    }

    @Test
    void testSumDiagonal() {
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(15, TwoDArrayOperations.sumDiagonal(testArray));
    }

    @Test
    void testFlattenArray() {
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, TwoDArrayOperations.flattenArray(testArray));
    }
}
