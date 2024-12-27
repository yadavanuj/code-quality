package com.agiledcoders;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testMultiplication() {
        int result = 2 * 3;
        assertEquals(6, result, "Result of multiplying 2 & 3 should be 6");
    }
}
