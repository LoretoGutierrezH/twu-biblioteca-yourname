package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NotificationTest {
        /*@Test
        public void test() {
            assertEquals(1, 1);
        }*/

        @Test
        public void test() {
            String message = "This is a test message";
            Notification cmd_notification = new Notification(message);
            assertEquals(message, cmd_notification.message);
        }
}
