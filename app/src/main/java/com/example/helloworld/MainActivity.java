package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnLetsToast(View v)
    {
        Context context = getApplicationContext();
        String message = "**Cheers!**";

        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void changeBgColor(View w) {
        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.bgHomePage);

        //RGB max is (255, 255, 255)
        layout.setBackgroundColor(Color.GREEN);
    }

}