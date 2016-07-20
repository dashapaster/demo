package com.example.dasha.androidtest;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by dasha on 20/07/16.
 */
public class MyWebViewClient extends WebViewClient
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        view.loadUrl(url);
        return true;
    }
}
