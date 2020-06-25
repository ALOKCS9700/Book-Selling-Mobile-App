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

public class LiteratureAndFiction extends AppCompatActivity {

    Spinner spinner;
    String spinnerdata;
    Button button;
    String[] lit_type;
    String type;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature_and_fiction);

        spinner=findViewById(R.id.literature_and_fiction);
        button=findViewById(R.id.lit_and_fiction_next);
        back=findViewById(R.id.lit_and_fiction_back);

        type=getIntent().getExtras().getString("type");

        lit_type=getResources().getStringArray(R.array.literature_and_fiction_chooser);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lit_type);
        spinner.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(LiteratureAndFiction.this,MainActivity.class);
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
                    case "Suspense and Thriller":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[0]);
                        startActivity(intent);
                        break;

                    case "Literary Fiction":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[1]);
                        startActivity(intent);
                        break;

                    case "Classics":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[2]);
                        startActivity(intent);
                        break;

                    case "Comics and Graphic Novel":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[3]);
                        startActivity(intent);
                        break;

                    case "Romance":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[4]);
                        startActivity(intent);
                        break;

                    case "Science Fiction":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[5]);
                        startActivity(intent);
                        break;

                    case "Mystery and Detective":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[6]);
                        startActivity(intent);
                        break;

                    case "Fantasy":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[7]);
                        startActivity(intent);
                        break;

                    case "Historical Fiction":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[8]);
                        startActivity(intent);
                        break;

                    case "Poetry and Drama":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[9]);
                        startActivity(intent);
                        break;

                    case "Short Stories":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[10]);
                        startActivity(intent);
                        break;

                    case "Horror":
                        intent=new Intent(LiteratureAndFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+lit_type[11]);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
