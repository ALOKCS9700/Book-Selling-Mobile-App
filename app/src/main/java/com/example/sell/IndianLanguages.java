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

public class IndianLanguages extends AppCompatActivity {

    Spinner spinner;
    Button button;
    String[] lang_type;
    String type;
    String spinnerdata;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_languages);

        spinner=findViewById(R.id.select_lang);
        button=findViewById(R.id.indian_lang_next);
        back=findViewById(R.id.indian_lang_back);

        type=getIntent().getExtras().getString("type");

        lang_type=getResources().getStringArray(R.array.indian_lang_chooser);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lang_type);
        spinner.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IndianLanguages.this,MainActivity.class);
                startActivity(intent);
            }
        });

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
                    case "Gujarati":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[0]);
                        startActivity(intent);
                        break;

                    case "Hindi":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[1]);
                        startActivity(intent);
                        break;

                    case "Marathi":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[2]);
                        startActivity(intent);
                        break;

                    case "Malayalam":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[3]);
                        startActivity(intent);
                        break;

                    case "Telugu":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[4]);
                        startActivity(intent);
                        break;

                    case "Punjabi":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[5]);
                        startActivity(intent);
                        break;

                    case "Bengali":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[6]);
                        startActivity(intent);
                        break;

                    case "Tamil":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[7]);
                        startActivity(intent);
                        break;

                    case "Kannada":
                        intent=new Intent(IndianLanguages.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+": "+lang_type[8]);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
