/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   16.08.15
 */
package ru.netimen.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ReaderModule {

    public final Reader reader;

    public ReaderModule(Reader reader) {
        this.reader = reader;
    }

    @Provides
    @Singleton
    Reader provideReader() {
        return reader;
    }

    @Provides
    @Singleton
    SelectionModule provideSelectionModule() {
        return new SelectionModule();
    }
}
