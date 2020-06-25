package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class EntranceExam extends AppCompatActivity {

    Spinner spinner;
    Button button;
    String[] profession;
    String spinnerdata;
    String type;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance_exam);

        button=findViewById(R.id.entrance_next);
        back=findViewById(R.id.entrance_exam_back);
        profession=getResources().getStringArray(R.array.profession);

        type=getIntent().getExtras().getString("type");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EntranceExam.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,profession);
        spinner=findViewById(R.id.select_prof);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinnerdata=(String)spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                 switch (spinnerdata)
                 {
                     case "----Select professional course----":
                         Toast.makeText(EntranceExam.this,"Please select a course",Toast.LENGTH_SHORT).show();
                         break;

                     case "Govt. Services":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[0]);
                         startActivity(intent);
                         break;

                     case "Defence":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[1]);
                         startActivity(intent);
                         break;

                     case "Medicine":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[2]);
                         startActivity(intent);
                         break;

                     case "MBA":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[3]);
                         startActivity(intent);
                         break;

                     case "UGC":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[4]);
                         startActivity(intent);
                         break;

                     case "UPSC":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[5]);
                         startActivity(intent);
                         break;

                     case "International Exam":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[6]);
                         startActivity(intent);
                         break;

                     case "SSC":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[7]);
                         startActivity(intent);
                         break;

                     case "LAW":
                         intent=new Intent(EntranceExam.this,IncludeSomeDetails.class);
                         intent.putExtra("type",type+profession[8]);
                         startActivity(intent);
                         break;

                 }
            }
        });
    }
}
