package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et_qual,et_percent,et_clg ;
                String qualification,percentage,college;
                Bundle extras=getIntent().getExtras();

                et_qual=(EditText) findViewById(R.id.qualification);
                qualification=et_qual.getText().toString();
                et_percent=(EditText) findViewById(R.id.percentage);
                percentage=et_percent.getText().toString();
                et_clg=(EditText) findViewById(R.id.college);
                college=et_clg.getText().toString();


                Intent i= new Intent(getApplicationContext(),MainActivity3.class);
                i.putExtras(extras);
                i.putExtra("qualification",qualification);
                i.putExtra("percentage",percentage);
                i.putExtra("college",college);
                startActivity(i);
            }
        });

        Button previous1=(Button) findViewById(R.id.previous1);
        previous1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });

    }
}
