/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   18.08.15
 */
package ru.netimen.dagger;

import com.netimen.androidmodules.helpers.Bus;

import javax.inject.Inject;

import ru.netimen.dagger.readercode.ReadingSystem;
import ru.netimen.dagger.traits.Trait;

@Trait(ReaderSharedFields_.class)
public abstract class ReaderTrait {

    @Inject
    protected Bus bus;

    @Inject
    protected ReaderSharedFields_ readerSharedFields;

    protected ReadingSystem readingSystem() {
        return readerSharedFields.readingSystem;
    }

    protected void setReadingSystem(ReadingSystem readingSystem) {
        readerSharedFields.readingSystem = readingSystem;
    }

}
