package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataMan> dataBase = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.vamos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataBase.add(new DataMan("safwan",1,2020));
        dataBase.add(new DataMan("shaz",2,4525));
        dataBase.add(new DataMan("hgd",3,2525));
        dataBase.add(new DataMan("sdds",4,2563));
        dataBase.add(new DataMan("dsds",5,8526));
        dataBase.add(new DataMan("dsfa",6,2020));
        dataBase.add(new DataMan("adadd",7,5252));
        dataBase.add(new DataMan("adaa",8,2020));
        dataBase.add(new DataMan("sdaefef",9,2102));
        dataBase.add(new DataMan("sffe",10,1205));
        dataBase.add(new DataMan("effew",23,2578));
        dataBase.add(new DataMan("efee",52,1546));
        dataBase.add(new DataMan("efefw",45,2023));
        dataBase.add(new DataMan("awff",23,2555));

        dataBase.add(new DataMan("safwan",1,2020));
        dataBase.add(new DataMan("shaz",2,4525));
        dataBase.add(new DataMan("hgd",3,2525));
        dataBase.add(new DataMan("sdds",4,2563));
        dataBase.add(new DataMan("dsds",5,8526));
        dataBase.add(new DataMan("dsfa",6,2020));
        dataBase.add(new DataMan("adadd",7,5252));
        dataBase.add(new DataMan("adaa",8,2020));
        dataBase.add(new DataMan("sdaefef",9,2102));
        dataBase.add(new DataMan("sffe",10,1205));
        dataBase.add(new DataMan("effew",23,2578));
        dataBase.add(new DataMan("efee",52,1546));
        dataBase.add(new DataMan("efefw",45,2023));
        dataBase.add(new DataMan("awff",23,2555));

        safAdapter safAdapter =  new safAdapter(this, dataBase);
        recyclerView.setAdapter(safAdapter);




    }
}