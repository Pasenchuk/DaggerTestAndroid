package com.ucs.daggertest.app.modules;

import com.ucs.daggertest.app.BlankFragment;
import com.ucs.daggertest.app.services.FooService;
import com.ucs.daggertest.app.services.MockService;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */

@Module(injects = BlankFragment.class)
public class MockFooModule {
    @Provides
    @Singleton
    FooService provideFooService() {
        return new MockService();
    }
}
