package sac4java.android_buttonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*add AndroidManifest.xml permissions for internet and set url with webview*/
public class WebPagesAct extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_pages);

        webView = (WebView) findViewById(R.id.webview);
        //webView.loadUrl("http://sachin4java.blogspot.in/p/android.html");
        webView.loadUrl("file:///android_asset/Read Write daily work_ Java Algorithms.html");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed(){
         if(webView.canGoBack()){
             webView.goBack();
         }else {
             finish();
         }
    }


}
