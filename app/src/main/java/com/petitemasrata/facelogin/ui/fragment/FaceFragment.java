package com.petitemasrata.facelogin.ui.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenhalolabs.facebooklogin.FacebookLoginActivity;
import com.petitemasrata.facelogin.R;

import java.util.ArrayList;

public class FaceFragment extends Fragment {

    public FaceFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String applicationId =  getResources().getString(R.string.facebook_app_id);
        ArrayList<String> permissions = new ArrayList<String>();
        permissions.add("public_profile");
        FacebookLoginActivity.launch(this, applicationId, permissions);

        return rootView;
    }
}

