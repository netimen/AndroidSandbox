/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   19.08.15
 */
package ru.netimen.dagger.bookmate;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;

import ru.netimen.dagger.MarkersTrait;
import ru.netimen.dagger.ReaderFragment;
import ru.netimen.dagger.ReaderTraitsContainer_;
import ru.netimen.dagger.SelectionTrait;
import ru.netimen.dagger.readercode.ReadingSystem;
import ru.netimen.dagger.traits.Traits;

@EFragment
@Traits(traits = {SelectionTrait.class, MarkersTrait.class}, sharedFields = {ReadingSystem.class})
public class BookmateReaderFragment extends ReaderFragment {

    @FragmentArg
    BookmateReader bookmateReader;

    private ReaderTraitsContainer_ readerTraitsContainer_;

    @AfterInject
    protected void afterInject() {
        readerTraitsContainer_ = new ReaderTraitsContainer_(getActivity(), bookmateReader);
    }
}
