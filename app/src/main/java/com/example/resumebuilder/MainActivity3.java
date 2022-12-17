package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et_pgm,et_tool,et_certificate ;
                String pgm,tools,certifications;
                Bundle extras=getIntent().getExtras();

                et_pgm=(EditText) findViewById(R.id.pgm);
                pgm=et_pgm.getText().toString();
                et_tool=(EditText) findViewById(R.id.tools);
                tools=et_tool.getText().toString();
                et_certificate=(EditText) findViewById(R.id.certifications);
                certifications=et_certificate.getText().toString();


                Intent i= new Intent(getApplicationContext(),MainActivity4.class);
                i.putExtras(extras);
                i.putExtra("pgm",pgm);
                i.putExtra("tools",tools);
                i.putExtra("certifications",certifications);
                startActivity(i);
            }
        });

        Button previous1=(Button) findViewById(R.id.previous1);
        previous1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(j);
            }
        });
    }
}
