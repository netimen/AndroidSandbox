/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   16.08.15
 */
package ru.netimen.dagger;

import dagger.Module;
import ru.netimen.dagger.code.ReadingSystem;

@Module
public class Reader extends BusModule {

    ReadingSystem readingSystem;

}
