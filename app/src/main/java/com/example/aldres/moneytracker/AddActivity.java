package com.example.aldres.moneytracker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddActivity extends AppCompatActivity {

    Boolean isTitleTextFilled = false;
    Boolean isPriceTextFilled = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final EditText titleEdit = findViewById(R.id.name);
        final EditText priceEdit = findViewById(R.id.price);
        final ImageButton addButton = findViewById(R.id.add);
        addButton.setEnabled(false);


        titleEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    isTitleTextFilled = true;
                    if (isTitleTextFilled && isPriceTextFilled) {
                        addButton.setEnabled(true);
                        addButton.setColorFilter(Color.rgb(199, 242,173));
                    }
                }

                else {
                    isTitleTextFilled = false;
                    addButton.setEnabled(false);
                    addButton.clearColorFilter();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        priceEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    isPriceTextFilled = true;
                    if (isTitleTextFilled && isPriceTextFilled) {
                        addButton.setEnabled(true);
                        addButton.setColorFilter(Color.rgb(199, 242,173));

                    }
                }

                else {
                    isPriceTextFilled = false;
                    addButton.setEnabled(false);
                    addButton.clearColorFilter();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() { super.onResume(); }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }}
