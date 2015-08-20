/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   16.08.15
 */
package ru.netimen.dagger;

import org.androidannotations.annotations.EBean;

import ru.netimen.dagger.readercode.SelectionStart;

@EBean
public class SelectionTrait extends ReaderTrait {

    void onSelectionStart(SelectionStart event) {

    }
}
