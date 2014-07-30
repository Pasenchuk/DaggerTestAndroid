package com.ucs.daggertest.app;

import android.app.Application;
import com.ucs.daggertest.app.modules.AppModule;
import com.ucs.daggertest.app.modules.MockAppModule;
import dagger.ObjectGraph;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */
public class MyApp extends Application {
    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(new MockAppModule(), new AppModule());
    }

    public void injectToObjectGraph(Object object) {
        objectGraph.inject(object);
    }
}
