package myapplication.com.example.tulv.tabhost_default;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("t1");
        tab1.setIndicator("tab1");
        tab1.setContent(R.id.linearLayout1);
        tabHost.addTab(tab1);


        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2");
        tab2.setIndicator("tab2");
        tab2.setContent(R.id.linearLayout2);
        tabHost.addTab(tab2);
        tabHost.setCurrentTab(0);
    }
}
