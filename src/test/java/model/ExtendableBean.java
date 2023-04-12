package model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ExtendableBean {
    public String name;
    private Map<String, String> properties = new HashMap<>();

    public ExtendableBean (String name) {
        this.name = name;
    }

    public void add (String k, String v) {
        properties.put(k, v);
    }
}