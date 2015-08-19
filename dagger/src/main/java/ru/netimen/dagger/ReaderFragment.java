/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   16.08.15
 */
package ru.netimen.dagger;

import android.app.Fragment;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EFragment;

@EFragment
public class ReaderFragment extends Fragment {

    protected ReaderTrait traits[];

    @AfterInject
    protected void afterInject() {
        ReaderComponent readerComponent = DaggerReaderComponent.create();

        traits = createTraits();
        for (ReaderTrait trait : traits)
            readerComponent.inject(trait);
    }

    protected ReaderTrait[] createTraits() {
        return new ReaderTrait[]{SelectionTrait_.getInstance_(getActivity())};
    }

}
