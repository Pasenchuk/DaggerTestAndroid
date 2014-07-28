package com.ucs.daggertest.app.modules;

import com.ucs.daggertest.app.BlankFragment;
import com.ucs.daggertest.app.services.FooService;
import com.ucs.daggertest.app.services.Service1;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.util.Objects;

/**
 * Created by Pasenchuk Victor on 28.07.14 in IntelliJ Idea
 */

@Module(injects = BlankFragment.class)
public class FooModule {
    @Provides
    @Singleton
    FooService provideFooService() {
        return new Service1();
    }
}
