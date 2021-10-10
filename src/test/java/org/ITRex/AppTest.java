package org.ITRex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void createGreetingTest() {
        Assertions.assertEquals("Hello, Peter!", App.createGreeting("Peter"));
    }
}