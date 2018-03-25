package com.dragontwister.bill_yard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by The Chocobos on 25-Mar-18.
 */

public class NewEntry extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_entry_layout);
        setTitle("New Entry");
    }
}
