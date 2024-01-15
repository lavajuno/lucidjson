#pragma once

#include <string>
#include <vector>

#include <lucidjson/jsonobject.hpp>

namespace LucidJSON {
    class Json {
    public:
        static JsonObject read(std::string text);

        static JsonObject read(std::vector<std::string> lines);

        static JsonObject readFile(std::string file_path);

        static std::string write(JsonObject e);

        static std::string writeFile(JsonObject e, std::string file_path);
    };
}
