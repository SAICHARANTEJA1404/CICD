package org.opencode.demo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();

        assertEquals(
                "Hello Charan Teja",
                controller.hello()
        );
    }
}