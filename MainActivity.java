package com.example.clee9.cmsc355_doppleganger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TakePicture(View view) {
        Intent intent = new Intent(this, TakePicture.class);
    }
    public void CreditsPg(View view) {
        Intent intent = new Intent(this, CreditsPage.class);
    }

    public void PicDatabase(View view) {
        Intent intent = new Intent(this, PictureDatabase.class);
    }
}