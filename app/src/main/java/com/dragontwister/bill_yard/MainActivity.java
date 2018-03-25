package com.dragontwister.bill_yard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewEntry(View view){
        intent = new Intent(this, NewEntry.class);
        startActivity(intent);
    }

    public void onClickGetInfo(View view){
        intent = new Intent(this, GetInfo.class);
        startActivity(intent);
    }

    public void onClickUpdateInfo(View view){
        intent = new Intent(this, UpdateInfo.class);
        startActivity(intent);
    }
}
