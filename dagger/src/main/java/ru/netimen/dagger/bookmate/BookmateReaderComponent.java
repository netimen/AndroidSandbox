/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger.bookmate;

import java.io.Serializable;

import javax.inject.Singleton;

import dagger.Component;
import ru.netimen.dagger.Reader;

@Singleton
@Component(modules = {BookmateReader.class, Reader.class})
public interface BookmateReaderComponent extends Serializable {
    void injectBookmate(BookmateReaderTrait trait);
}
