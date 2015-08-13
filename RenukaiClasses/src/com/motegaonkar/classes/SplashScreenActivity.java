package com.motegaonkar.classes;

import com.motegaonkarchemistryclasses.chemistryking.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Hemant on 16-Jul-15.
 */
public class SplashScreenActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread thread = new Thread() 
        {

            
			public void run() {

                try {
                    sleep(2000);
                 
                    
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                   
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            }


        };

        thread.start();
    }
}