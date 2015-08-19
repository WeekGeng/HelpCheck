package com.example.administrator.helpcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MarketSelActivity extends AppCompatActivity {
    private ListView lv_market;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_sel);
        initView();
    }

    private void initView() {
        lv_market= (ListView) findViewById(R.id.lv_market);
    }
}
