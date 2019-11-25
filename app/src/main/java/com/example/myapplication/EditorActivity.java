package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class EditorActivity extends AppCompatActivity {

    private EditText mItemName;

    private EditText mItemSummary;

    private EditText mItemWeight;

    private Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        mItemName = findViewById(R.id.itemName);
        mItemSummary = findViewById(R.id.itemSummary);
        mItemWeight = findViewById(R.id.itemWeight);
        mSpinner = findViewById(R.id.typeSpinner);


    }
}
