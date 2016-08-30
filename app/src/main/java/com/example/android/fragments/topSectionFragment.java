package com.example.android.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Fragments do not talk to each other directly
 * All communication happens through the main activity.
 */



// Your class extends Fragment
public class topSectionFragment extends Fragment{

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    // Override onCreateView to inflate your layout
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        // Setup some references to deal with input.
        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        Button button = (Button) view.findViewById(R.id.button);

        // Setup an event handler to deal with the button click.
        // Could just as easily be setup in xml.
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View view){
        Log.i("Event:", (topTextInput.getText().toString() + " " + bottomTextInput.getText().toString()));
    }
}
