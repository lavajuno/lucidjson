# lucidjson

Straightforward JSON serialization &amp; deserialization library for Java.

[Source Code](https://github.com/lavajuno/lucidjson)

[Releases](https://github.com/lavajuno/lucidjson/releases)

[Documentation](https://lavajuno.github.io/lucidjson/docs/index.html)

## Features
- Easy-to-use dynamic JSON objects
- Simple interface for serialization/deserialization of classes
- Serialize as minified or pretty JSON
- Descriptive error reporting

## Usage Examples

> Note: These are very basic examples and will be updated to include more realistic use cases.

Deserializing a JSON object from a string:

```java
import org.lavajuno.lucidjson.JsonObject;

public static void main(String[] args) {
    String s = "{ \"myKey\": \"myValue\" }";
    JsonObject o = JsonObject.from(s);
}
```
Serializing a JSON object to a string:
```java
import org.lavajuno.lucidjson.JsonObject;

public static void main(String[] args) {
    String s = o.toJsonString(true);
}
```

> Note: The above methods are identical for JSON arrays.

Modifying JSON objects:

```java
import org.lavajuno.lucidjson.JsonObject;
import org.lavajuno.lucidjson.JsonString;

public static void main(String[] args) {
    JsonObject o = JsonObject.from("{ \"myKey\": \"myValue\" }");
    o.put("myKey2", new JsonString("myValue2"));
}

```

Implementing JsonSerializable for a class:

```java
import org.lavajuno.lucidjson.JsonNumber;

public class User implements JsonSerializable {
    private String name;
    private int age;

    public User() {
        name = "";
        age = -1;
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject o = new JsonObject();
        o.put("name", new JsonString(name));
        o.put("age", new JsonNumber(age));
        return o;
    }

    @Override
    public void fromJsonObject(JsonObject o) {
        this.name = ((JsonString) o.get("name")).value();
        this.age = ((JsonNumber) o.get("age")).toInt();
    }
}

public static void main(String[] args) {
    String s = "{\"name\":\"bob\",\"age\":12345}";
    User a = new User();
    a.fromJsonString(s); // deserialize from JSON string
    String s = a.toJsonString(); // serialize to JSON string
}

```

> Classes only need to implement toJsonObject() and fromJsonObject().
> Serialization / deserialization to and from strings is handled by the interface.
> 
> This behavior can be overridden if desired.

## Use Cases
lucidjson is designed to allow you to easily write custom JSON serialization & deserialization
functions for classes. It can also be used to modify JSON documents without loading them
into a rigid class structure.

## Licensing

lucidjson is Free and Open Source Software, and is released under the MIT license. (See [`LICENSE`](LICENSE))
