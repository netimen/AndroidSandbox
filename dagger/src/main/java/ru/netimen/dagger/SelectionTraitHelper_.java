/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   20.08.15
 */
package ru.netimen.dagger;

import com.netimen.androidmodules.helpers.Bus;

import ru.netimen.dagger.readercode.SelectionStart;

public class SelectionTraitHelper_ {
    SelectionTraitHelper_(final SelectionTrait selectionTrait) {
        final Bus.EventListener<SelectionStart> selectionStartEventListener = new Bus.EventListener<SelectionStart>() {
            @Override
            public void onEvent(SelectionStart event) {
                selectionTrait.onSelectionStart(event);
            }
        };
        selectionTrait.bus.register(SelectionStart.class, selectionStartEventListener); // cur unregister
    }
}
