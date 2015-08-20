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
import ru.netimen.dagger.ReaderComponent_;
import ru.netimen.dagger.ReaderModule_;

@Singleton
@Component(modules = {BookmateReader.class, ReaderModule_.class})
public interface BookmateReaderComponent_ extends ReaderComponent_ { // CUR geneerate
    void inject(BookmateReaderTrait trait);
}
