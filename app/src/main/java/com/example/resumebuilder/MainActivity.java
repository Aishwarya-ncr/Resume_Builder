package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next1=(Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et_name,et_dob,et_email ,et_addr;
                String name,dob,email,addr;

                et_name=(EditText) findViewById(R.id.name);
                name=et_name.getText().toString();
                et_dob=(EditText) findViewById(R.id.dob);
                dob=et_dob.getText().toString();
                et_email=(EditText) findViewById(R.id.email);
                email=et_email.getText().toString().trim();
                et_addr=(EditText) findViewById(R.id.addr);
                addr=et_addr.getText().toString().trim();

                if (TextUtils.isEmpty(name)){
                     et_name.setError("Name field required");
                return;
                }
                if (TextUtils.isEmpty(dob)){
                    et_dob.setError("Date_of_birth field required");
                return;
                }
                if (TextUtils.isEmpty(email)){
                    et_email.setError("email field required");
                    return;
                }
                if (TextUtils.isEmpty(addr)){
                    et_addr.setError("Address field required");
                    return;
                }

                Intent i= new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("name",name);
                i.putExtra("dob",dob);
                i.putExtra("email",email);
                i.putExtra("addr",addr);

                startActivity(i);

            }
        });

    }
}