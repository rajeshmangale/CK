package com.motegaonkar.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.motegaonkarchemistryclasses.chemistryking.R;
import com.motegaonkarchemistryclasses.chemistryking.R.id;
import com.motegaonkarchemistryclasses.chemistryking.R.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.WindowCompat;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Syllabus extends Activity 
{

	Button sybssc11,sybhsc12,sybcbse11,sybcbse12;
	Context context;
	TextView syb;


	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_syllabus);
		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/RobotoSlab-Regular.ttf");

		getActionBar().setDisplayHomeAsUpEnabled(true);

		sybcbse11 = (Button)findViewById(R.id.cbse11button);
		sybcbse12 = (Button)findViewById(R.id.cbse12button);
		sybssc11 = (Button)findViewById(R.id.ssc11button);
		sybhsc12 = (Button)findViewById(R.id.ssc12button);
		syb = (TextView)findViewById(R.id.syllabus);
		
		
		sybcbse11.setOnClickListener(new OnClickListener() 
		{



			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub

				AssetManager am = context.getAssets();
				try {
					InputStream is = am.open("syb11.txt"); 
					BufferedReader in = new BufferedReader(new InputStreamReader(is));
					String inputLine;
					while ((inputLine = in.readLine()) != null)
						System.out.println(inputLine);
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});


		sybcbse12.setOnClickListener(new OnClickListener() 
		{
			AssetManager assetManager = getAssets();
			InputStream input;
			String text = "";


			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				try {
					// get input stream for text
					InputStream is = getAssets().open("syb12.txt");
					// check size
					int size = is.available();
					// create buffer for IO
					byte[] buffer = new byte[size];
					// get data to buffer
					is.read(buffer);
					// close stream
					is.close();
					// set result to TextView
					syb.setText(new String(buffer));
				}
				catch (IOException ex) {
					return;
				}



			}


		});
	}
}
