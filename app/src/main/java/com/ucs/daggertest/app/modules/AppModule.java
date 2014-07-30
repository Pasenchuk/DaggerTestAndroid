package com.ucs.daggertest.app.modules;

import com.ucs.daggertest.app.BlankFragment;
import com.ucs.daggertest.app.MainActivity;
import com.ucs.daggertest.app.services.Foo2Service;
import com.ucs.daggertest.app.services.FooService;
import com.ucs.daggertest.app.services.Service1;
import com.ucs.daggertest.app.services.Service2;
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
