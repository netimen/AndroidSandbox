/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   16.08.15
 */
package ru.netimen.dagger;

import com.netimen.androidmodules.helpers.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.netimen.dagger.code.ReadingSystem;

@Module
public class Reader {

//    public final Reader reader;
//
//    public ReaderModule(Reader reader) {
//        this.reader = reader;
//    }
//
//    @Provides
//    @Singleton
//    Reader provideReader() {
//        return reader;
//    }
////    @Provides
////    @Singleton
////    Reader provideReader() {
////        return new Reader("lalal");
////    }
//
//    @Provides
//    @Singleton
//    SelectionModule provideSelectionModule() {
//        return new SelectionModule();
//    }
//}

    ReadingSystem readingSystem;

    @Provides
    @Singleton
    Bus bus() {
        return new Bus();
    }


}
