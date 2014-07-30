package com.ucs.daggertest.app.modules;

import com.ucs.daggertest.app.entry_screen.BlankFragment;
import com.ucs.daggertest.app.entry_screen.MainActivity;
import com.ucs.daggertest.app.services.foo2service.Foo2Service;
import com.ucs.daggertest.app.services.foo_service.FooService;
import com.ucs.daggertest.app.services.foo_service.Service1;
import com.ucs.daggertest.app.services.foo2service.Service2;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */

@Module(injects = {BlankFragment.class, MainActivity.class})
public class AppModule {
    @Provides
    @Singleton
    FooService provideFooService() {
        return new Service1();
    }

    @Provides
    @Singleton
    Foo2Service provideFoo2Service() {
        return new Service2();
    }
}
