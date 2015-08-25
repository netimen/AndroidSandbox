/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger.bookmate;

import javax.inject.Singleton;

import dagger.Component;
import ru.netimen.dagger.ReaderModule_;
import ru.netimen.dagger.ReaderTrait;
import ru.netimen.dagger.traits.BusModule;

@Singleton
@Component(modules = {BookmateReader.class, ReaderModule_.class, BusModule.class})
public interface BookmateReaderComponent_ {

    void inject(BookmateReaderTrait trait);

    void inject(ReaderTrait trait);
}
