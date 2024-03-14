package org.lavajuno.lucidjson.testhelpers;

import org.lavajuno.lucidjson.JsonObject;
import org.lavajuno.lucidjson.JsonSerializable;
import org.lavajuno.lucidjson.JsonString;

public class TestUser implements JsonSerializable {
    private String name;

    public TestUser() {
        name = "";
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject o = new JsonObject();
        o.put("name", new JsonString(name));
        return o;
    }

    @Override
    public void fromJsonObject(JsonObject o) {
        this.name = ((JsonString) o.get("name")).value();
    }
}
