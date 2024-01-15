package org.lavajuno.lucidjson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class JsonTests {

    @Test
    public void testJson() throws ParseException {
        String s = """
				{
				    "0_testObjectValues": {
				        "0_testString": "StringValue",
				        "1_testInt": 3,
				        "2_testFloat": -7.2,
				        "3_testExp": 4.1e5,
				        "4_testTrue": true,
				        "5_testFalse": false,
				        "6_testNull": null
				    },
				    "1_testArrayValues": [
				        "StringValue",
				        1,
				        5.0,
				        -2.3E54,
				        true,
				        false,
				        null
				    ]
				}""";
        JsonObject j = JsonObject.from(s);
        System.out.println(j.toString(true));
        Assertions.assertEquals(s, j.toString(true));
    }

	@Test
	public void testEmptyArray() throws ParseException {
		String s = "[]";
		JsonArray j = JsonArray.from(s);
		System.out.println(j.toString(true));
	}

	@Test
	public void testEmptyObject() throws ParseException {
		String s = "{}";
		JsonObject j = JsonObject.from(s);
		System.out.println(j.toString(true));
	}

	@Test
	public void testEmptyString() throws ParseException {
		String s = "{\"test\":\"\"}";
		JsonObject j = JsonObject.from(s);
		System.out.println(j.toString(true));
	}

	@Test
	public void testBadObjects() {
		try {
			JsonObject j = JsonObject.from("{");
			throw new RuntimeException("Accepted bad object.");
		} catch(ParseException ignored) {}

		try {
			JsonObject j = JsonObject.from("[]");
			throw new RuntimeException("Accepted bad object.");
		} catch(ParseException ignored) {}

		try {
			JsonObject j = JsonObject.from("\\{\\}");
			throw new RuntimeException("Accepted bad object.");
		} catch(ParseException ignored) {}
	}

	@Test
	public void testBadArrays() {
		try {
			JsonArray j = JsonArray.from("[");
			throw new RuntimeException("Accepted bad array.");
		} catch(ParseException ignored) {}

		try {
			JsonArray j = JsonArray.from("{}");
			throw new RuntimeException("Accepted bad array.");
		} catch(ParseException ignored) {}

		try {
			JsonArray j = JsonArray.from("\\[\\]");
			throw new RuntimeException("Accepted bad array.");
		} catch(ParseException ignored) {}
	}
}
