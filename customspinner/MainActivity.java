package com.solution.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.solution.customspinner.adapter.Adapterclass;
import com.solution.customspinner.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<CountryItem> mCountryList;
    private CountryAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
        Spinner spinnerCountries = findViewById(R.id.spinner_countries);
        mAdapter = new CountryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);
        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryItem clickedItem = (CountryItem) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCountryName();
                Toast.makeText(MainActivity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryItem("teacher", R.drawable.teacher_1));
        mCountryList.add(new CountryItem("India", R.drawable.ic_launcher_background));
        mCountryList.add(new CountryItem("teacher2", R.drawable.teacher_1));
        mCountryList.add(new CountryItem("India2", R.drawable.ic_launcher_background));
        mCountryList.add(new CountryItem("India3", R.drawable.ic_launcher_background));
//        mCountryList.add(new CountryItem("China", R.drawable.china));
//        mCountryList.add(new CountryItem("USA", R.drawable.usa));
//        mCountryList.add(new CountryItem("Germany", R.drawable.germany));
    }
}