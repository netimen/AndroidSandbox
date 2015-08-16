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
import org.androidannotations.annotations.FragmentArg;

import ru.netimen.dagger.vehicle.DaggerVehicleComponent;
import ru.netimen.dagger.vehicle.Vehicle;
import ru.netimen.dagger.vehicle.VehicleComponent;

@EFragment(resName = "fragment_reader")
public class ReaderFragment extends Fragment {
    @FragmentArg
    String documentUuid;

    @AfterInject
    void afterInject() {
        VehicleComponent vehicleComponent = DaggerVehicleComponent.create();
        Vehicle v1 = vehicleComponent.provideVehicle();
        Vehicle v2 = vehicleComponent.provideVehicle();
        final Reader reader = new Reader(documentUuid);
//        ReaderComponent readerComponent = DaggerReaderComponent.builder().readerModule(new ReaderModule(reader)).build();
        ReaderComponent readerComponent = DaggerReaderComponent.create();
        readerComponent.inject(reader);
        readerComponent.toString();

    }
}
