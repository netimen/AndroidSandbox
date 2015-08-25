/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger.bookmate;


import javax.inject.Inject;

import ru.netimen.dagger.ReaderTrait;
import ru.netimen.dagger.readercode.Document;
import ru.netimen.dagger.traits.InjectId;
import ru.netimen.dagger.traits.Trait;

@Trait(BookmateReader.class)
public abstract class BookmateReaderTrait extends ReaderTrait {

    @Inject
    Document document;

    @InjectId("bookmark")
    @Inject
    String bookmark;

    @InjectId("discovered")
    @Inject
    String discovered;
}
