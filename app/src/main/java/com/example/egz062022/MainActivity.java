package com.example.egz062022;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int likesCount = 0;
    private TextView tvCounter;
    private Button btnPolub, btnUsun, btnZapisz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);
        btnPolub = findViewById(R.id.btnPolub);
        btnUsun = findViewById(R.id.btnUsun);
        btnZapisz = findViewById(R.id.btnZapisz);

        btnPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likesCount++;
                updateCounterText();
            }
        });

        btnUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likesCount > 0) {
                    likesCount--;
                }
                updateCounterText();
            }
        });

        btnZapisz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void updateCounterText() {
        tvCounter.setText(likesCount + " polubień");
    }
}