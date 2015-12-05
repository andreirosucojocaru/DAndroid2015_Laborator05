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
        Intent loginActivityIntent = getActivity().getIntent();
        String username = loginActivityIntent.getStringExtra(Constants.USERNAME);
        String password = loginActivityIntent.getStringExtra(Constants.PASSWORD);
        usernameTextView = (TextView)getActivity().findViewById(R.id.username_text_view);
        passwordTextView = (TextView)getActivity().findViewById(R.id.password_text_view);
        usernameTextView.setText(username);
        passwordTextView.setText(password);
        intentButton = (Button)getActivity().findViewById(R.id.intent_button);
        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dateAndTimeIntent = new Intent(Constants.DATE_AND_TIME_INTENT_ACTION);
                getActivity().startActivity(dateAndTimeIntent);
            }
        });
        broadcastReceiverButton = (Button)getActivity().findViewById(R.id.broadcast_receiver_button);
        broadcastReceiverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dateAndTimeIntent = new Intent(Constants.DATE_AND_TIME_BROADCAST_RECEIVER_ACTION);
                getActivity().sendBroadcast(dateAndTimeIntent);
            }
        });
        uriButton = (Button)getActivity().findViewById(R.id.uri_button);
        uriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri dateAndTimeUri = Uri.parse(Constants.DATE_AND_TIME_URI_ACTION);
                Intent dateAndTimeIntent = new Intent(Intent.ACTION_VIEW, dateAndTimeUri);
                getActivity().startActivity(dateAndTimeIntent);
            }
        });
    }


}
