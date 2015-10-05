package com.zerodevefforts.halfcapsuletogglebutton;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class HalfCapsuleToggleActivity extends Activity {

    final static int LEFT = 0;
    final static int RIGHT = 1;

    int buttonPressed = LEFT;

    Button buttonLeft, buttonRight;
    int greyColor = Color.parseColor("#FFCFCFCF");
    int greenColor = Color.parseColor("#FF18ACAC");
    int buttonRightColor = greyColor;
    int buttonLeftColor = greenColor;

    GradientDrawable gdLeft, gdRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_half_capsule_toggle);
        buttonLeft = (Button)findViewById(R.id.button_left);
        buttonRight = (Button)findViewById(R.id.button_right);


        buttonLeft.setTextColor(Color.WHITE);
        gdLeft = (GradientDrawable)buttonLeft.getBackground();
        gdLeft.setColor(greenColor);

        buttonRight.setTextColor(Color.BLACK);
        gdRight = (GradientDrawable)buttonRight.getBackground();
        gdRight.setColor(greyColor);

        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buttonPressed == RIGHT) {
                    if (buttonLeftColor == greyColor) {
                        gdLeft.setColor(greenColor);
                        buttonLeft.setTextColor(Color.WHITE);
                        buttonLeftColor = greenColor;

                        //flip colors for the other button
                        gdRight.setColor(greyColor);
                        buttonRight.setTextColor(Color.BLACK);
                        buttonRightColor = greyColor;
                    } else {
                        gdLeft.setColor(greyColor);
                        buttonLeft.setTextColor(Color.BLACK);
                        buttonLeftColor = greyColor;

                        //flip colors for the other button
                        gdRight.setColor(greenColor);
                        buttonRight.setTextColor(Color.WHITE);
                        buttonRightColor = greenColor;
                    }

                    buttonPressed = LEFT;
                }
            }
        });

        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonPressed == LEFT) {
                    if (buttonRightColor == greyColor) {
                        gdRight.setColor(greenColor);
                        buttonRight.setTextColor(Color.WHITE);
                        buttonRightColor = greenColor;

                        //flip colors for the other button
                        gdLeft.setColor(greyColor);
                        buttonLeft.setTextColor(Color.BLACK);
                        buttonLeftColor = greyColor;

                    } else {
                        gdRight.setColor(greyColor);
                        buttonRight.setTextColor(Color.BLACK);
                        buttonRightColor = greyColor;

                        //flip colors for the other button
                        gdLeft.setColor(greenColor);
                        buttonLeft.setTextColor(Color.WHITE);
                        buttonLeftColor = greenColor;
                    }

                    buttonPressed = RIGHT;
                }
            }
        });
    }
}
