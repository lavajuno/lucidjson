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
        JsonObject j = Json.read(s);
        System.out.println(Json.write(j));
        Assertions.assertEquals(s, Json.write(j));
    }

	@Test
	public void testEmptyArray() throws ParseException {
		String s = "{\"test\":[]}";
		JsonObject j = Json.read(s);
		System.out.println(Json.write(j));
	}

	@Test
	public void testEmptyObject() throws ParseException {
		String s = "{}";
		JsonObject j = Json.read(s);
		System.out.println(Json.write(j));
	}

	@Test
	public void testEmptyString() throws ParseException {
		String s = "{\"test\":\"\"}";
		JsonObject j = Json.read(s);
		System.out.println(Json.write(j));
	}
}
