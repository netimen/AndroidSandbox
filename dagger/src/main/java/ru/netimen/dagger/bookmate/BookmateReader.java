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
public class BookmateReader implements Serializable { // CUR generate
    private final Document document;
    private final String bookmark;

    public BookmateReader(Document document, String bookmark) {
        this.document = document;
        this.bookmark = bookmark;
    }

    @Provides
    Document document() {
        return document;
    }

    @Provides
    @Bookmark
    String bookmark() {
        return bookmark;
    }
}
