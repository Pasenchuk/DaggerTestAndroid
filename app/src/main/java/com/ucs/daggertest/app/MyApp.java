package com.ucs.daggertest.app;

import android.app.Application;
import com.ucs.daggertest.app.modules.FooModule;
import com.ucs.daggertest.app.modules.MockFooModule;
import dagger.ObjectGraph;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */
public class MyApp extends Application {
    private ObjectGraph objectGraph;
    private static final boolean TEST_BUILD = true;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(TEST_BUILD ? new MockFooModule() : new FooModule());
    }

    public void injectToObjectGraph(Object object) {
        objectGraph.inject(object);
    }
}
