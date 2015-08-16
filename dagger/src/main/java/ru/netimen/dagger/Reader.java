/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   16.08.15
 */
package ru.netimen.dagger;

public class Reader {
    public final String documentUuid;
    private final Object parts[] = new Object[]{new SelectionModule()};

    public Reader(String documentUuid) {
        this.documentUuid = documentUuid;
    }
}
