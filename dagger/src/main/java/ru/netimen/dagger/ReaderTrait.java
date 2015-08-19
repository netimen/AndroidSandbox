/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   18.08.15
 */
package ru.netimen.dagger;

import com.netimen.androidmodules.helpers.Bus;

import javax.inject.Inject;

public abstract class ReaderTrait {
//    @Inject
//    protected Reader reader;

//    @Inject
//    protected ReaderModule reader;

    @Inject
    protected Bus bus;
}
