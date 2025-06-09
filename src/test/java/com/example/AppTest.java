package com.example;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAppCreation() {
        App app = new App();
        assertNotNull(app);  // Checks that app is created successfully
    }
}
