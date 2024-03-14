package org.lavajuno.lucidjson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lavajuno.lucidjson.testhelpers.TestUser;

import java.text.ParseException;

public class JsonSerializableTests {
    @Test
    public void testInterface() throws ParseException {
        TestUser u = new TestUser();
        String s = "{\"name\":\"alice\"}";
        u.fromJsonString(s);
        Assertions.assertEquals(s, u.toJsonString());
    }
}
