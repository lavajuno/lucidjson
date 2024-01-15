# lucidjson

Straightforward JSON serialization &amp; deserialization library for Java.

[Source Code](https://github.com/lavajuno/lucidjson)

[Releases](https://github.com/lavajuno/lucidjson/releases)

[Documentation](https://lavajuno.github.io/lucidjson/docs/index.html)

## Features
- Serialization to and from strings and files
- Creation and modification of objects
- Supports minimal and indented multiline output
- Simple, documented interface
- Error reporting (to be improved)

## Usage

> Note: These are very basic examples and will be updated to include more realistic use cases.

Serializing and deserializing a JSON object:

```java
import org.lavajuno.lucidjson.Json;
import org.lavajuno.lucidjson.JsonObject;

JsonObject o = Json.read("{ \"myKey\": \"myValue\" }");
System.out.println(Json.write(o));
```

```
Output:
{
    "myKey": "myValue"
}
```

Modifying a JSON object:

```java
import org.lavajuno.lucidjson.JsonObject;
import org.lavajuno.lucidjson.JsonString;

JsonObject o = Json.read("{ \"myKey\": \"myValue\" }");
o.put("myKey2", new JsonString("myValue2"));
System.out.println(Json.write(o));
```

```
Output:
{
    "myKey": "myValue",
    "myKey2": "myValue2"
}
```

## Licensing

LucidJSON is Free and Open Source Software, and is released under the MIT license. (See [`LICENSE`](LICENSE))