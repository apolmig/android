package com.example.formacio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        TextView placeText = (TextView) this.findViewById(R.id.main_place_text);
        ImageView iconText = (ImageView) this.findViewById(R.id.main_place_icon);
        LinearLayout placeLayout = (LinearLayout) this.findViewById(R.id.main_place_layout);

        placeText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                
            }
        });


    }
}
