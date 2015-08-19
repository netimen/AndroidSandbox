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

import ru.netimen.dagger.MarkersTrait_;
import ru.netimen.dagger.ReaderFragment;

@EFragment
public class BookmateReaderFragment extends ReaderFragment {

    @FragmentArg
    BookmateReaderComponent readerComponent;

    private BookmateReaderTrait[] bookmateTraits;

    @AfterInject
    protected void afterInject() {
        super.afterInject();

        bookmateTraits = new BookmateReaderTrait[]{MarkersTrait_.getInstance_(getActivity())};
        for (BookmateReaderTrait trait : bookmateTraits)
            readerComponent.injectBookmate(trait);
    }
}
