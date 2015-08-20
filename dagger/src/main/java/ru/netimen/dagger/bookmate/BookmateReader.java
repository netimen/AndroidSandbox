/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger.bookmate;

import java.io.Serializable;

import dagger.Module;
import dagger.Provides;
import ru.netimen.dagger.readercode.Document;

@Module
public class BookmateReader implements Serializable {
    public final Document document;

    public BookmateReader(Document document) {
        this.document = document;
    }

    @Provides
    Document document() {
        return document;
    }
}
