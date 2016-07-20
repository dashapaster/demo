package com.example.dasha.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WebListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_list);
        final ArrayList<String> websites = new ArrayList<>();
        websites.add("www.gymglish.com");
        websites.add("www.frantastique.com");
        websites.add("www.vatefaireconjuguer.com");
        websites.add("www.worksweetwork.com");
        websites.add("www.thewordofthemonth.com");
        websites.add("www.richmorning.com");


        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new WebAdapter(getApplicationContext(), websites));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Intent intent = new Intent(getApplicationContext(), WebsiteActivity.class);
              intent.putExtra("website", websites.get(position));
              startActivity(intent);
            }
        });

    }

}
