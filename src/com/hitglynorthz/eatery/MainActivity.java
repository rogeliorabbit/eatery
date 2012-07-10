package com.hitglynorthz.eatery;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.webkit.*;

public class MainActivity extends Activity {

	//Nuestra vista necesaria para la web
    private WebView mWebView;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        //asociamos
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        
        //cargo la url con la web
        mWebView.loadUrl("http://labs.blumbablog.com/eatery");
        //cargo un .html que he situado en la carpeta asset/ del proyecto
        //mWebView.loadUrl("file:///android_asset/ejemploWebview.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
        
}

