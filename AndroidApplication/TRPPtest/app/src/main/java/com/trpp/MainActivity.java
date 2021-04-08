package com.trpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // кнопка-меню смены доски
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button createcolumn = (Button) findViewById(R.id.createcolumn);
        createcolumn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // движение кнопки создания колонки
                RelativeLayout rl = new RelativeLayout();
                LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                rl.setLayoutParams(params);
                LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                params1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                createcolumn.setLayoutParams(params1);
                rl.addView(createcolumn);

                //создание колонки
                ScrollView scrollViewmain = new ScrollView();
                Button createtext = (Button) findViewById(R.id.createtext);
                createtext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // движение кнопки создания текста
                        RelativeLayout r2 = new RelativeLayout();
                        LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                        r2.setLayoutParams(params);
                        LayoutParams params1 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                        params1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                        createtext.setLayoutParams(params1);
                        r2.addView(createtext);
                        //создание текста
                        ScrollView scrollViewtext = new ScrollView();
                        TextView textView = new TextView();
                        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        scrollViewtext.addView(textView);
                    }
                });

            }
        });
    }
}
