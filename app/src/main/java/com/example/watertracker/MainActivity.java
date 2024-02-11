package com.example.watertracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sum = (TextView) findViewById(R.id.sum);
        EditText promptcontent = (EditText) findViewById(R.id.promptcontent);
        Button itemsave = (Button) findViewById(R.id.itemsave);
        Button reset = (Button) findViewById(R.id.reset);


//        TODO db connection
//         TODO predefined values


        itemsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sum.getText().toString().trim().length() == 0){
                    sum.setText("0");
                }
                int value=Integer.parseInt(sum.getText().toString());


                if(promptcontent.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Provide a number", Toast.LENGTH_SHORT).show();
                }else{
                    value+=Integer.parseInt(promptcontent.getText().toString());
                    sum.setText(String.valueOf(value));
                }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sum.setText("0");
                promptcontent.setText("");

            }
        });


    }

}