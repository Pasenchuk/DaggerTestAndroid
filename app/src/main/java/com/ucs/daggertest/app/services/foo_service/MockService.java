package com.ucs.daggertest.app.services.foo_service;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */
public class MockService implements FooService {
    @Override
    public String bar() {
        return "bar";
    }

    @Override
    public String bas() {
        return "bas";
    }
}
