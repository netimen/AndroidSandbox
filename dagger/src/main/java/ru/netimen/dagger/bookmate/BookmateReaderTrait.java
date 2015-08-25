/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger.bookmate;


import javax.inject.Inject;
import javax.inject.Named;

import ru.netimen.dagger.ReaderTrait;
import ru.netimen.dagger.readercode.Document;
import ru.netimen.dagger.traits.Trait;

@Trait(BookmateReader.class)
public abstract class BookmateReaderTrait extends ReaderTrait {

    @Inject
    Document document;

    @Inject
    @Named("bookmark")
    String bookmark;

    @Inject
    @Named("discovered")
    String discovered;
}
