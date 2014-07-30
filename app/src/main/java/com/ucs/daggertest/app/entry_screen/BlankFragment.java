package com.ucs.daggertest.app.entry_screen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ucs.daggertest.app.MyApp;
import com.ucs.daggertest.app.R;
import com.ucs.daggertest.app.services.foo_service.FooService;

import javax.inject.Inject;

/**
 * A placeholder fragment containing a simple view.
 */
public class BlankFragment extends Fragment {

    @Inject
    FooService fooService;


    @Override
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApp myApp = (MyApp) (getActivity().getApplication());
        myApp.injectToObjectGraph(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Log.i("inject", fooService.bar());
        Log.i("inject", fooService.bas());
        return rootView;
    }
}