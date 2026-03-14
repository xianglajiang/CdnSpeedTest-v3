package com.speedtest.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle s){
        super.onCreate(s);
        WebView w=new WebView(this);
        setContentView(w);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("file:///android_asset/index.html");
    }
}
