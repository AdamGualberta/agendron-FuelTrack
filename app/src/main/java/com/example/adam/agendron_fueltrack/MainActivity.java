package com.example.adam.agendron_fueltrack;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    /*private EditText dateText;
    private EditText stationText;
    private EditText odometerText;
    private EditText gradeText;
    private EditText amountText;
    private EditText unitcostText;*/
    public ArrayList<dataEntry> dataArray = new ArrayList<dataEntry>();
    protected int index = 0;
    public ListView logView;
    public ArrayAdapter<dataEntry> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button addButton = (Button)findViewById(R.id.buttonAdd);
        Button logButton = (Button)findViewById(R.id.buttonLogs);

        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setResult(RESULT_OK);
                EditText latestDate = (EditText)findViewById(R.id.editTextDate);
                EditText latestStation = (EditText)findViewById(R.id.editTextStation);
                EditText latestOdometer = (EditText)findViewById(R.id.editTextOdometer);
                EditText latestGrade = (EditText)findViewById(R.id.editTextGrade);
                EditText latestAmount = (EditText)findViewById(R.id.editTextAmount);
                EditText latestUnitcost = (EditText)findViewById(R.id.editTextUnitCost);
                TextView finalCost = (TextView)findViewById(R.id.textViewfinalcostCalc);
                TextView logs = (TextView)findViewById(R.id.textViewLogs);/////////////////////////
                dataEntry latestData = new dataEntry();
                latestData.setIndex(index);
                latestData.setDate(latestDate.getText().toString());
                latestData.setStation(latestStation.getText().toString());
                latestData.setOdometer(Float.parseFloat(latestOdometer.getText().toString()));
                latestData.setGrade(latestGrade.getText().toString());
                latestData.setAmount(Float.parseFloat(latestAmount.getText().toString()));
                latestData.setUnitcost(Float.parseFloat(latestUnitcost.getText().toString()));
                calculateCost latestCost = new calculateCost(latestData.newAmount, latestData.newUnitcost);
                latestData.setFinalcost(latestCost.getCost());
                dataArray.add(latestData);
                finalCost.setText(String.format("%2f", latestData.finalcostCalc));
                latestDate.setText("");
                latestStation.setText("");
                latestOdometer.setText("");
                latestGrade.setText("");
                latestAmount.setText("");
                latestUnitcost.setText("");
                index++;
                logs.setText(String.format("%1d", latestData.getIndex()));
            }
        });
        logButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setResult(RESULT_OK);
                Intent logIntent = new Intent(MainActivity.this, viewLogs.class);
                //logIntent.putParcelableArrayListExtra("list", dataArray)
                startActivity(logIntent);
            }
        });

    }

    protected void onStart(){
        super.onStart();
    }

}
