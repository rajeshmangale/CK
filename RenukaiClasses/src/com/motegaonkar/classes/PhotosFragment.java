package com.motegaonkar.classes;

import com.motegaonkarchemistryclasses.chemistryking.R;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PhotosFragment extends Fragment {
	
	public PhotosFragment(){}
	 TextView mFirstMobileNumber;
	 TextView mSecondMobileNumber;
     TextView mLandlineNumber;
     TextView mTeamResoneuronance;	   
     String mPhoneNumber;

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
        mLandlineNumber = (TextView) rootView.findViewById(R.id.landline_number);
        mFirstMobileNumber = (TextView) rootView.findViewById(R.id.first_mobile_number);
        mSecondMobileNumber = (TextView) rootView.findViewById(R.id.second_mobile_number);
        mTeamResoneuronance = (TextView)rootView.findViewById(R.id.team_resoneuronance);

        mLandlineNumber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mPhoneNumber = mLandlineNumber.getText().toString();
                call();
            }
        });

        mFirstMobileNumber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mPhoneNumber = mFirstMobileNumber.getText().toString();
                call();
            }
        });

        mSecondMobileNumber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mPhoneNumber = mSecondMobileNumber.getText().toString();
                call();
            }
        });

        //This function will send the user to other browser to browse resoneuronance website
        mTeamResoneuronance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resoneuronanceUrl = "http://www.resoneuronance.com";

                Intent sendToWebsite = new Intent(Intent.ACTION_VIEW);
                sendToWebsite.setData(Uri.parse(resoneuronanceUrl));
                startActivity(sendToWebsite);
            }
        });
        return rootView;
    }
	public void call() {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:" + mPhoneNumber));
        startActivity(callIntent);
    }
}
