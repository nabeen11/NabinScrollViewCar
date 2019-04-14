package com.example.nabinscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etCarName,etYear,etColor,etPurchasePrice,etEngineSize;
    private Button btnCreateCar,btnCreateDiesel;
    private TextView tvOutput;
    private  int countvehicle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCarName = (EditText) findViewById(R.id.etCarName);
        etYear = (EditText) findViewById(R.id.etYear);
        etColor = (EditText) findViewById(R.id.etColor);
        etPurchasePrice = (EditText) findViewById(R.id.etPurchasePrice);
        etEngineSize = (EditText) findViewById(R.id.etEngineSize);
        tvOutput = (TextView) findViewById(R.id.tvOutput);
        btnCreateCar = (Button) findViewById(R.id.btnCreateCar);
        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!validate()) {
                    return;
                }
                String name = etCarName.getText().toString();
                int year = Integer.parseInt(etYear.getText().toString());
                String color = etColor.getText().toString();
                float engine = Float.parseFloat(etEngineSize.getText().toString());
                float price = Float.parseFloat(etPurchasePrice.getText().toString());
                countvehicle++;
                String heading = "Number of vehicle counted: " + countvehicle + "\n";
                String content = "Manufacture : " + name + " | Year : " + year + " | Color :" + color +
                        " | Engine :" + engine + " | Price :" + price + "\n\n";
                tvOutput.append(heading + content);
            }

            private boolean validate() {

                if (TextUtils.isEmpty(etCarName.getText().toString())) {
                    etCarName.setError("please enter the car name");
                    etCarName.requestFocus();
                    return false;
                } else if (TextUtils.isEmpty(etColor.getText().toString())) {
                    etColor.setError("please enter the car name");
                    etColor.requestFocus();
                    return false;
                } else if (TextUtils.isEmpty(etYear.getText().toString())) {
                    etYear.setError("please enter the car name");
                    etYear.requestFocus();
                    return false;
                } else if (TextUtils.isEmpty(etPurchasePrice.getText().toString())) {
                    etPurchasePrice.setError("please enter the car name");
                    etPurchasePrice.requestFocus();
                    return false;
                } else if (TextUtils.isEmpty(etEngineSize.getText().toString())) {
                    etEngineSize.setError("please enter the car name");
                    etEngineSize.requestFocus();
                    return false;
                }
                return true;
            }
        });
    }
}

