/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   16.08.15
 */
package ru.netimen.dagger;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ReaderModule_.class})
public interface ReaderComponent_ { // CUR generate this

    void inject(ReaderTrait trait);
}
