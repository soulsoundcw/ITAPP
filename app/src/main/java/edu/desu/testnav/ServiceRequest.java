package edu.desu.testnav;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ServiceRequest extends AppCompatActivity {

    private Spinner sort_by_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicerequest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
  //          public void onClick(View view) {
    //            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
      //                  .setAction("Action", null).show();
        //    }
//        });
    }
    public void addItemsOnSpinner() {

        Spinner sort_by_spinner = (Spinner) findViewById(R.id.problemType);
        ArrayAdapter<String> adapter;
        List<String> list;

        list = new ArrayList<>();
        list.add("Account Management");
        list.add("Move/Add/Change");
        list.add("Software Install");
        list.add("Phone/Voicemail");
        list.add("Classroom Tech");
        list.add("Desktop/Laptop");
        list.add("Banner Functionality");
        list.add("Printer");
        list.add("Network Connectivity");
        adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sort_by_spinner.setAdapter(adapter);
    }
}

