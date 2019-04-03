package com.example.monugupta.cg_qp2015;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity  {


    ViewFlipper viewFlipper;
    Button next;
    Button previous;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper)findViewById(R.id.viewflipper);
        next = (Button)findViewById(R.id.next);
        previous = (Button)findViewById(R.id.pre);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showPrevious();
            }
        });
    }
}
