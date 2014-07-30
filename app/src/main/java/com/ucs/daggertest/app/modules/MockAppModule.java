package com.ucs.daggertest.app.modules;

import com.ucs.daggertest.app.services.foo_service.FooService;
import com.ucs.daggertest.app.services.foo_service.MockService;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */

@Module(
        complete = false,
        library = true,
        overrides = true
)
public class MockAppModule {
    @Provides
    @Singleton
    FooService provideFooService() {
        return new MockService();
    }
}
