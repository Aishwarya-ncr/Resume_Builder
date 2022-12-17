package com.example.resumebuilder;

import static com.example.resumebuilder.R.id.showName;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle extras=getIntent().getExtras();
        String name=extras.getString("name");
        String dob=extras.getString("dob");
        String email=extras.getString("email");
        String addr=extras.getString("addr");
        String qualification=extras.getString("qualification");
        String percentage=extras.getString("percentage");
        String college=extras.getString("college");
        String pgm=extras.getString("pgm");
        String tools=extras.getString("tools");
        String certifications=extras.getString("certifications");

        TextView showName,showDob,showEmail,showAddr,showQual,showPercent,showCollege,showPgming,showTools,showCertification;
        showName= findViewById(R.id.showName);
        showDob=findViewById(R.id.showDob);
        showEmail=findViewById(R.id.showEmail);
        showAddr=findViewById(R.id.showAddr);
        showQual=findViewById(R.id.showQual);
        showPercent=findViewById(R.id.showPercent);
        showCollege=findViewById(R.id.showCollege);
        showPgming=findViewById(R.id.showPgming);
        showTools=findViewById(R.id.showTools);
        showCertification=findViewById(R.id.showCertification);

        showName.setText(name);
        showDob.setText(dob);
        showEmail.setText(email);
        showAddr.setText(addr);
        showQual.setText(qualification);
        showPercent.setText(percentage);
        showCollege.setText(college);
        showPgming.setText(pgm);
        showTools.setText(tools);
        showCertification.setText(certifications);


        Button previous1=findViewById(R.id.previous1);
        previous1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(j);
            }
        });
    }
}