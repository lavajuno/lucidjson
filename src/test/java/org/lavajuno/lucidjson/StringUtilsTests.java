package org.lavajuno.lucidjson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lavajuno.lucidjson.util.StringUtils;

import java.text.ParseException;

public class StringUtilsTests {
    @Test
    public void testEscape() {
        Assertions.assertEquals("\\\"", StringUtils.escape("\""));
        Assertions.assertEquals("\\\\", StringUtils.escape("\\"));
        Assertions.assertEquals("\\b", StringUtils.escape("\b"));
        Assertions.assertEquals("\\f", StringUtils.escape("\f"));
        Assertions.assertEquals("\\n", StringUtils.escape("\n"));
        Assertions.assertEquals("\\r", StringUtils.escape("\r"));
        Assertions.assertEquals("\\t", StringUtils.escape("\t"));
        Assertions.assertEquals("abc", StringUtils.escape("abc"));

    }

    @Test void testUnescape() throws ParseException {
        Assertions.assertEquals("\"", StringUtils.unescape("\\\""));
        Assertions.assertEquals("\\", StringUtils.unescape("\\\\"));
        Assertions.assertEquals("\b", StringUtils.unescape("\\b"));
        Assertions.assertEquals("\f", StringUtils.unescape("\\f"));
        Assertions.assertEquals("\n", StringUtils.unescape("\\n"));
        Assertions.assertEquals("\r", StringUtils.unescape("\\r"));
        Assertions.assertEquals("\t", StringUtils.unescape("\\t"));
        Assertions.assertThrows(ParseException.class, () -> StringUtils.unescape("\\o"));
        Assertions.assertEquals("abc", StringUtils.unescape("abc"));
    }
}
