package com.example.vharari.tp01_fragments;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class PM_Fragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        return inflater.inflate(
                R.layout.pm_fragment, container, false);
    }
}