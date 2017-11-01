package com.example.user.practice;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.net.HttpURLConnection;
import java.net.URL;

public class MyListActivity extends ListActivity {
    private String strurl = "https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=fWi_WfuYMeny8Ae4yIvQCw";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        setListAdapter(adapter);


    }


}
