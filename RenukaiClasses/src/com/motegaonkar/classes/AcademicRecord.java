package com.motegaonkar.classes;

import java.util.ArrayList;
import java.util.List;

import com.motegaonkarchemistryclasses.chemistryking.R;
import com.motegaonkarchemistryclasses.chemistryking.R.layout;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AcademicRecord extends Activity
{
	

	
	ViewPager mViewPager;
	private int[] IMAGES = { R.drawable.c_2014, R.drawable.c_2014_1,R.drawable.c_2013_01,R.drawable.c_2013_02,R.drawable.c_2013_03,R.drawable.c_2013_04,R.drawable.c_2012_01,
			R.drawable.c_2012_02,R.drawable.c_2011_01,R.drawable.c_2011_02};

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_academic_record);
		
		  ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
	        ImageAdapter adapter = new ImageAdapter();
	        viewPager.setAdapter(adapter);
		
	       
	
	}
	class ImageAdapter extends PagerAdapter
	{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return IMAGES.length;
		}

		@Override
		public boolean isViewFromObject(View view, Object object) 
		{
			// TODO Auto-generated method stub
			return view == ((ImageView) object);
		}
		
		 @Override
	        public Object instantiateItem(ViewGroup container, int position) {
	            ImageView imageView = new ImageView(getApplicationContext());
	            imageView.setImageResource(IMAGES[position]);
	            ((ViewPager) container).addView(imageView, 0);
	            return imageView;
	        }

	        @Override
	        public void destroyItem(ViewGroup container, int position, Object object) {
	            ((ViewPager) container).removeView((ImageView) object);
	        }
		
	}
}

