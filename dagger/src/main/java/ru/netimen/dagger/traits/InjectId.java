package ru.netimen.dagger.traits;

import javax.inject.Qualifier;

/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   25.08.15
 */
@Qualifier
public @interface InjectId {
    String value();
}
