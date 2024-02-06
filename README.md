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
- Descriptive error reporting

## Usage Examples

> Note: These are very basic examples and will be updated to include more realistic use cases.

Deserializing a JSON object from a string:

```java
import org.lavajuno.lucidjson.JsonObject;

String s = "{ \"myKey\": \"myValue\" }";
JsonObject o = JsonObject.from(s);
```

Deserializing a JSON object from a file:
```java
import org.lavajuno.lucidjson.JsonObject;

String path = "users.json";
JsonObject o = JsonObject.fromFile(path);
```

Serializing a JSON object to a string:
```java
import org.lavajuno.lucidjson.JsonObject;

String path = "users.json";
JsonObject o = JsonObject.fromFile(path);
String s = o.toString(true);
```

> Note: The above methods are identical for JSON arrays.

Modifying JSON objects:

```java
import org.lavajuno.lucidjson.JsonObject;
import org.lavajuno.lucidjson.JsonString;

JsonObject o = JsonObject.from("{ \"myKey\": \"myValue\" }");
o.put("myKey2", new JsonString("myValue2"));
```

## Use Cases
lucidjson is designed to allow you to quickly write custom JSON serialization & deserialization
functions for classes. It can also be used to modify JSON documents without loading them
into a rigid class structure.

## Licensing

lucidjson is Free and Open Source Software, and is released under the MIT license. (See [`LICENSE`](LICENSE))
