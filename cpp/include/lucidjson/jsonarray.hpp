#pragma once

#include <vector>
#include <string>

#include <lucidjson/jsonentity.hpp>

namespace LucidJSON {
    class JsonArray : public JsonEntity {
    public:
        JsonArray() : values({}) {}

        JsonArray(std::vector<JsonEntity> values) : values(values) {}

        JsonEntity get(int index);

        void set(int index, JsonEntity value);

        void add(JsonEntity value);

        void remove(int index);

        void clear();

        int size();

        std::vector<JsonEntity> getValues();

        std::string toString();

    protected:
        JsonArray(std::string text);

        std::string toString(int indent);
    
    private:
        std::vector<JsonEntity> values;

    private:
        static std::vector<JsonEntity> parseValues(std::string text);

    };
}
