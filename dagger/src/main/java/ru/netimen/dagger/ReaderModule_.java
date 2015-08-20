/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   20.08.15
 */
package ru.netimen.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.netimen.dagger.traits.BusModule;

@Module
public class ReaderModule_ extends BusModule { // CUR generate

    @Singleton
    @Provides
    ReaderSharedFields_ readerSharedFields() {
        return new ReaderSharedFields_();
    }
}
