package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class MathServiceTest {

    private final MathService mathService = new MathService();

    @Test
    void testAdd() {
        assertEquals(5, mathService.add(2, 3), "2 + 3 phải bằng 5");
    }

    @Test
    void testIsPositive() {
        assertTrue(mathService.isPositive(10), "10 phải là số dương");
        assertFalse(mathService.isPositive(-5), "-5 không phải là số dương");
        assertFalse(mathService.isPositive(0), "0 không phải là số dương");
    }
}