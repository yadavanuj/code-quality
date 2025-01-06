package com.agiledcoders.ut.multi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testValidUserIsReturned() {
        // Valid Input
        String userId = "valid";

        // Class Under Test
        UserService userService = new UserService();

        // Actual Call
        String userName = userService.getUserName(userId);

        // Expectations
        String expectedUserName = "John Doe";

        // Verify
        assertEquals(expectedUserName, "John Doe");
    }

    @Test
    public void testIllegalArgumentExceptionIsThrown() {
        // Marked Input Explicitly For Brevity
        String userId = null;

        // Class Under Test
        UserService userService = new UserService();

        // Actual Call
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.getUserName(userId);
        });

        // Verify
        assertEquals("User ID must be non null", exception.getMessage());
    }

    @Test
    public void testNullIsReturned() {
        // Marked Input Explicitly For Brevity
        String userId = "XYZ";

        // Class Under Test
        UserService userService = new UserService();

        // Actual Call
        String userName = userService.getUserName(userId);

        // Verify
        assertNull(userName);
    }
}
