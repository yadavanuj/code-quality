package com.agiledcoders.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    @Test
    void testAdd() {
        // Create a mock for MathService
        MathService mockMathService = mock(MathService.class);

        // Define behavior for the mock
        when(mockMathService.add(2, 3)).thenReturn(5);

        // Inject the mock into the Calculator
        Calculator calculator = new Calculator(mockMathService);

        // Assert the result
        assertEquals(5, calculator.add(2, 3));

        // Verify interaction with the mock
        verify(mockMathService).add(2, 3);
    }
}
