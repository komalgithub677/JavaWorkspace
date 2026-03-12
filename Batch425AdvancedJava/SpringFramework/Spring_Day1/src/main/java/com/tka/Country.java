package com.tka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

    @Value("91")
    int conId;

    @Value("India")
    String name;

    public Country() {
    }

    @Override
    public String toString() {
        return "Country [conId=" + conId + ", name=" + name + "]";
    }
}