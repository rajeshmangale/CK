package com.motegaonkar.classes;

import com.motegaonkarchemistryclasses.chemistryking.R;
import com.motegaonkarchemistryclasses.chemistryking.R.id;
import com.motegaonkarchemistryclasses.chemistryking.R.layout;
import com.motegaonkarchemistryclasses.chemistryking.R.menu;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class About_RenukaiClasses extends Fragment
{


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(
				R.layout.fragment_about__renukai_classes, container, false);
		return rootView;
	}

}
