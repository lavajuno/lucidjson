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

## Usage

> Note: These are very basic examples and will be updated to include more realistic use cases.

Serializing and deserializing a JSON object:

```java
import org.lavajuno.lucidjson.Json;
import org.lavajuno.lucidjson.JsonObject;

JsonObject o = JsonObject.from("{ \"myKey\": \"myValue\" }");
System.out.println(o.toString(true));
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

JsonObject o = JsonObject.from("{ \"myKey\": \"myValue\" }");
o.put("myKey2", new JsonString("myValue2"));
System.out.println(o.toString(true));
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
