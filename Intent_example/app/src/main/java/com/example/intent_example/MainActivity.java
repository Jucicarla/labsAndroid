package com.example.intent_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtView1;
    private Button bt2;

    public TextView getTxtView1() {
        return txtView1;
    }

    public void setTxtView1(TextView txtView1) {
        this.txtView1 = txtView1;
    }

    public Button getBt2() {
        return bt2;
    }

    public void setBt2(Button bt2) {
        this.bt2 = bt2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}