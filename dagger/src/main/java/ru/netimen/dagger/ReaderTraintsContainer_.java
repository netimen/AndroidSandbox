/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   20.08.15
 */
package ru.netimen.dagger;

import android.content.Context;

import ru.netimen.dagger.bookmate.BookmateReader;
import ru.netimen.dagger.bookmate.BookmateReaderComponent_;
import ru.netimen.dagger.bookmate.DaggerBookmateReaderComponent_;

public class ReaderTraintsContainer_ { // CUR generate
    public final SelectionTraitHelper_ selectionTraitHelper;

    public ReaderTraintsContainer_(Context context, BookmateReader bookmateReader) {
        BookmateReaderComponent_ readerComponent = DaggerBookmateReaderComponent_.builder().bookmateReader(bookmateReader).build();

        final SelectionTrait_ selectionTrait = SelectionTrait_.getInstance_(context);
        readerComponent.inject(selectionTrait);
        final MarkersTrait_ markersTrait = MarkersTrait_.getInstance_(context);
        readerComponent.inject(markersTrait);
        selectionTraitHelper = new SelectionTraitHelper_(selectionTrait);
    }
}
