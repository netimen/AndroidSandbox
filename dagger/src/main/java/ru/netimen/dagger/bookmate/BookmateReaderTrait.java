/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger.bookmate;


import javax.inject.Inject;

import ru.netimen.dagger.code.Document;
import ru.netimen.dagger.ReaderTrait;

public abstract class BookmateReaderTrait extends ReaderTrait {
    @Inject
    Document document;
}
