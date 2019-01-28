package com.khairy.realestateapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DepartmentDetails extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_details);

       /* listView = findViewById(R.id.listView);

        String [] details = {"Rooms         3","Floor             2","Baths            2","Finish-type         Super Lux","Discription" +"\nReception : 2 Pieces Finishing : Super Lux"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,details);

        listView.setAdapter(arrayAdapter);*/
    }
}
