package com.example.kokeilu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditDataActivity extends AppCompatActivity {

    private static final String TAG = "EditDataActivity";

    private Button btnSave,btnDelete;
    private EditText editable_item;
    private EditText editable_item2;

    DatabaseHelper mDatabaseHelper;

    private String selectedName;
    private int selectedID;
    private String selectedVahvuus;
    private String selectedMaara;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_data_layout);
        btnSave = findViewById(R.id.btnSave);
        btnDelete = findViewById(R.id.btnDelete);
        editable_item = findViewById(R.id.editable_item2);
        mDatabaseHelper = new DatabaseHelper(this);
        editable_item2 = findViewById(R.id.editable_item2);

        //get the intent extra from the ListDataActivity
        Intent receivedIntent = getIntent();

        //now get the itemID we passed as an extra
        selectedID = receivedIntent.getIntExtra("id",-1); // NOTE: -1 is just the default value

        //now get the name we passed as an extra
        selectedName = receivedIntent.getStringExtra("name");

        //now get the dosage we passed as an extra
        selectedMaara = receivedIntent.getStringExtra("maara");

        //now get the quantity we passed as an extra
        selectedVahvuus = receivedIntent.getStringExtra("vahvuus");

        //set the text to show the current selected name
        editable_item.setText(selectedName);

        //set the text to show the current quantity
        editable_item2.setText(selectedMaara);

        //set the text to show the current quantity
        editable_item2.setText(selectedVahvuus);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String item = editable_item.getText().toString();
                String item2 = editable_item2.getText().toString();

                if (!item.equals("")) {
                    mDatabaseHelper.upDateName(item, selectedID, selectedName);
                } else if (!item2.equals("")) {
                    mDatabaseHelper.upDateMaara(selectedID, selectedMaara,selectedVahvuus);
                } else {
                    Toast.makeText(getApplicationContext(), "You must enter a name", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseHelper.deleteName(selectedName,selectedID, selectedMaara, selectedVahvuus);
                editable_item2.setText("");
                editable_item.setText("");
                Toast.makeText(getApplicationContext(),"Removed from database",Toast.LENGTH_LONG).show();
            }
        });
    }
    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message)
    {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
