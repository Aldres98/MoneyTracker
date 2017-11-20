package com.example.aldres.moneytracker;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.aldres.moneytracker.api.Api;

public class AddActivity extends AppCompatActivity {

    public static final String EXTRA_TYPE = "type";
    public static final String RESULT_ITEM = "item";
    public static final int RC_ADD_ITEM = 99;
    private String type;

    Boolean isTitleTextFilled = false;
    Boolean isPriceTextFilled = false;
    private Api api;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final EditText titleEdit = findViewById(R.id.name);
        final EditText priceEdit = findViewById(R.id.price);
        final ImageButton addButton = findViewById(R.id.add);
        addButton.setEnabled(false);
        api = ((App) getApplication()).getApi();
        type = getIntent().getStringExtra(EXTRA_TYPE);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                result.putExtra(RESULT_ITEM, new Item(titleEdit.getText().toString(), Integer.valueOf(priceEdit.getText().toString()), type));
                setResult(RESULT_OK, result);
                finish();
            }
        });


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
                        addButton.setColorFilter(Color.rgb(199, 242, 173));
                    }
                } else {
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
                        addButton.setColorFilter(Color.rgb(199, 242, 173));

                    }
                } else {
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
    protected void onDestroy() {super.onDestroy();}
    }

