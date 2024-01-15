cmake_minimum_required(VERSION 3.22)
project(lucidjson VERSION 0.0.1 LANGUAGES C CXX)

set(CMAKE_CXX_STANDARD 17)

include_directories(${CMAKE_CURRENT_SOURCE_DIR}/include)

add_library(lucidjson 
    src/json.cpp
    src/jsonarray.cpp
    src/jsonentity.cpp
    src/jsonliteral.cpp
    src/jsonnumber.cpp
    src/jsonobject.cpp
    src/jsonstring.cpp
)

target_include_directories(lucidjson PUBLIC
        ${CMAKE_CURRENT_SOURCE_DIR}/include)
