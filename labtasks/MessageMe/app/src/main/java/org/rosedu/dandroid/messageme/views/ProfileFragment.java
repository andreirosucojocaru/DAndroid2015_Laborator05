package org.rosedu.dandroid.messageme.views;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.rosedu.dandroid.messageme.general.Constants;

import org.rosedu.dandroid.messageme.R;

public class ProfileFragment extends Fragment {

    private TextView usernameTextView;
    private TextView passwordTextView;

    private Button intentButton;
    private Button broadcastReceiverButton;
    private Button uriButton;

    public ProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO: exercise 3

        // TODO: exercise 4a - intent

        // TODO: exercise 4b - broadcast receiver

        // TODO: exercise 4c - URI

    }


}
