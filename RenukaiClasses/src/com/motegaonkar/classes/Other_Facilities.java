package com.motegaonkar.classes;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ZoomControls;

import com.motegaonkarchemistryclasses.chemistryking.R;

public class Other_Facilities extends Fragment 
{

	ZoomControls zoom;
	ImageView img;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(
				R.layout.fragment_other__facilities, container, false);

		zoom = (ZoomControls)rootView.findViewById(R.id.zoomControls1);
		img = (ImageView)rootView.findViewById(R.id.other_facilities_imageView);

		zoom.setOnZoomInClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				float x = img.getScaleX();
				float y = img.getScaleY();

				img.setScaleX((float) (x+1));
				img.setScaleY((float) (y+1));

			}
		});


		zoom.setOnZoomOutClickListener(new OnClickListener() 
		{

			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				float x = img.getScaleX();
				float y = img.getScaleY();

				img.setScaleX((float) (x-1));
				img.setScaleY((float) (y-1));

			}
		});

		return rootView;
	}

}
