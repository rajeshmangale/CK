package com.motegaonkar.classes;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.motegaonkarchemistryclasses.chemistryking.R;

public class FindPeopleFragment extends Fragment {
	protected WebView mWebView;
  
	public FindPeopleFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_find_people, container, false);
         
       
        
        mWebView = (WebView)rootView.findViewById(R.id.webView);
        if(isNetworkAvailable()){
        	
				        mWebView.loadUrl("http://www.motegaonkarchemistryclasses.com/notification.html");
				        WebSettings webSettings = mWebView.getSettings();
				        webSettings.setJavaScriptEnabled(true);
				        mWebView.setWebViewClient(new WebViewClient());
				       
				        mWebView.setDownloadListener(new DownloadListener()
				        {
				         public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength)
				         {    
				          //download file using web browser
				        	 mWebView.loadUrl("http://docs.google.com/gview?embedded=true&url=" + url);
//				          Intent i = new Intent(Intent.ACTION_VIEW);
//				          i.setData(Uri.parse(url));
//				          startActivity(i);
				         }
				        });
        }
        else{
        	
        	    mWebView.loadUrl("file:///android_asset/nointernet/index.html");
		        WebSettings webSettings = mWebView.getSettings();
		        webSettings.setJavaScriptEnabled(true);
		        mWebView.setWebViewClient(new WebViewClient());
        	
        }
        
		return rootView;
        
    }

	private boolean isNetworkAvailable() {
		 ConnectivityManager connectivityManager 
         = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
   NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
   return activeNetworkInfo != null && activeNetworkInfo.isConnected();
		
	}
}
