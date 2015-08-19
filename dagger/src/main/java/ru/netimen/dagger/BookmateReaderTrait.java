/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger;


import javax.inject.Inject;

public abstract class BookmateReaderTrait extends ReaderTrait {
    @Inject
    Document document;
}
