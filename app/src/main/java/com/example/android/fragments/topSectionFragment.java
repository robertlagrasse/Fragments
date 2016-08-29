package com.example.android.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by robert on 8/29/16.
 */

// Your class extends Fragment
public class topSectionFragment extends Fragment{
    @Nullable

    // Override onCreateView to inflate your layout
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);
        return view;
    }
}
