package com.smart.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText numberET;
    Button submitBtn;
    RecyclerView recyclerview;
    LinearLayout directorNoData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);
        submitBtn = findViewById(R.id.submitBtn);
        numberET = findViewById(R.id.numberET);
        directorNoData = findViewById(R.id.directorNoData);

        directorNoData.setVisibility(View.VISIBLE);
        recyclerview.setVisibility(View.GONE);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkValidation();
            }
        });

    }

    private void checkValidation() {
        if (numberET.getText().toString().isEmpty()) {
            numberET.setError("Enter a valid between 1 to 9 number");
            numberET.requestFocus();
        }
        else if (numberET.getText().toString().equals("1")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("2")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("3")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
                    new Model("three"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("4")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
                    new Model("three"),
                    new Model("four"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("5")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
                    new Model("three"),
                    new Model("four"),
                    new Model("five"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("6")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
                    new Model("three"),
                    new Model("four"),
                    new Model("five"),
                    new Model("six"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("7")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
                    new Model("three"),
                    new Model("four"),
                    new Model("five"),
                    new Model("six"),
                    new Model("seven"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("8")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
                    new Model("three"),
                    new Model("four"),
                    new Model("five"),
                    new Model("six"),
                    new Model("seven"),
                    new Model("eight"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else if (numberET.getText().toString().equals("9")){
            directorNoData.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            Model[] myListData = new Model[] {
                    new Model("one"),
                    new Model("two"),
                    new Model("three"),
                    new Model("four"),
                    new Model("five"),
                    new Model("six"),
                    new Model("seven"),
                    new Model("eight"),
                    new Model("nine"),
            };

            Adapter adapter = new Adapter(myListData);
            recyclerview.setHasFixedSize(true);
            recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            recyclerview.setAdapter(adapter);
        }
        else {
            numberET.setError("Enter a valid between 1 to 9 number");
            numberET.requestFocus();
        }
    }
}