package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;

public class CreateWebViewIntent extends Intent {
    public CreateWebViewIntent(Context context, Class<WebViewFallbackActivity> webViewFallbackActivityClass) {
        super(context, webViewFallbackActivityClass);
    }

    public WebView getWebView() {
        return WebViewFallbackActivity.webViewHolder.webView;
    }
}