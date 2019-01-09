package com.example.arslan.kolesaintern2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnalyticsModel analyticsModel = new AnalyticsModel().Builder("das","adsd","asf","dasd", new Date()).build();
    }
}
