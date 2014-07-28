package com.ucs.daggertest.app.modules;

import com.ucs.daggertest.app.MainActivity;
import com.ucs.daggertest.app.services.Foo2Service;
import com.ucs.daggertest.app.services.Service2;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */

@Module(injects = MainActivity.class)
public class Foo2Module {
    @Provides
    @Singleton
    Foo2Service provideFooService() {
        return new Service2();
    }
}
