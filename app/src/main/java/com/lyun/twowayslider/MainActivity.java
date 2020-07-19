package com.lyun.twowayslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.print.PrinterId;
import android.widget.TextView;

import com.yun.twowayslider.TwoWaySlider;

public class MainActivity extends AppCompatActivity {

    private TwoWaySlider twoWaySlider;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twoWaySlider = findViewById(R.id.twoway);
        textView = findViewById(R.id.tv_num);

        twoWaySlider.setLeftProgress(50);
        twoWaySlider.setRightProgress(50);
        twoWaySlider.setOnSeekBarChangeListener(new TwoWaySlider.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(int leftProgress, int rightProgress) {
                textView.setText(  leftProgress+ " - " + rightProgress);
            }
        });

    }
}
