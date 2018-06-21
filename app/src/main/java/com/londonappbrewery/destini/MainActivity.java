package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button btnBottom;
    Button btnTop;
    TextView txt;
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        btnBottom = (Button)findViewById(R.id.buttonBottom);
        btnTop = (Button)findViewById(R.id.buttonTop);
        txt = (TextView)findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = index + 2;
                txt.setText(R.string.T3_Story);
                btnTop.setText(R.string.T3_Ans1);
                btnBottom.setText(R.string.T3_Ans2);

                if (index == 5 || index == 6){
                    txt.setText(R.string.T6_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = index + 1;
                txt.setText(R.string.T2_Story);
                btnTop.setText(R.string.T2_Ans1);
                btnBottom.setText(R.string.T2_Ans2);

                if (index == 4){
                    txt.setText(R.string.T4_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }

                if (index == 5 || index == 6){
                    txt.setText(R.string.T5_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }
            }
        });
    }
}
