package com.example.administrator.helpcheck.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Administrator on 2015/8/19.
 */
public class MarketSelAdapter extends BaseAdapter{
    private String[] markets;
    public MarketSelAdapter(String[] markets){
        this.markets=markets;
    }
    @Override
    public int getCount() {
        return markets.length;
    }
    @Override
    public Object getItem(int i) {
        return markets[i];
    }
    @Override
    public long getItemId(int i) {
        return markets.length;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        
        return null;
    }
}
