package com.motegaonkar.classes;



import com.motegaonkarchemistryclasses.chemistryking.R;



import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class HomeFragment extends Fragment 
{

	private float lastX;

	int mFlipping = 0 ; 

	ViewFlipper flipper;


	public HomeFragment(){}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{


		View rootView = inflater.inflate(R.layout.fragment_home, container, false);



		//Button notifyButton = (Button)rootView.findViewById(R.id.notifyButton);
		//Button contactButton = (Button)rootView.findViewById(R.id.contactButton);


		TextView className = (TextView) rootView.findViewById(R.id.class_name);
		Typeface robotoRegular = Typeface.createFromAsset(getActivity().getAssets(), "fonts/RobotoSlab-Regular.ttf");
		className.setTypeface(robotoRegular);









		//		notifyButton.setOnClickListener(new OnClickListener(){
		//
		//
		//
		//			@Override
		//			public void onClick(View v) 
		//			{
		//
		//
		//						Fragment fragment = new FindPeopleFragment();
		//						FragmentManager fragmentManager = getFragmentManager();
		//						fragmentManager.beginTransaction()
		//						.replace(R.id.frame_container, fragment).commit();
		//
		//				// update selected item and title, then close the drawer
		//				////				mDrawerList.setItemChecked(position, true);
		//				////				mDrawerList.setSelection(position);
		//				////				setTitle(navMenuTitles[position]);
		//				////				mDrawerLayout.closeDrawer(mDrawerList);
		//			}
		//			//        	
		//			//        	
		//		});

		//		contactButton.setOnClickListener(new OnClickListener()
		//		{
		//
		//			@Override
		//			public void onClick(View v) 
		//			{
		//				Fragment fragment = new PhotosFragment();
		//				FragmentManager fragmentManager = getFragmentManager();
		//				fragmentManager.beginTransaction()
		//				.replace(R.id.frame_container, fragment).commit();
		//
		//				// update selected item and title, then close the drawer
		//				////				mDrawerList.setItemChecked(position, true);
		//				////				mDrawerList.setSelection(position);
		//				////				setTitle(navMenuTitles[position]);
		//				////				mDrawerLayout.closeDrawer(mDrawerList);
		//			}
		//			//        	
		//			//        	
		//		});
		return rootView;
	}





}
