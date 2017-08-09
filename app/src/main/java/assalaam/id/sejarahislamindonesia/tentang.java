package assalaam.id.sejarahislamindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://ww3w.google.com");
    }
}
