package com.line.parser;

public interface Parser<T> {
    T parse(String str);
}
