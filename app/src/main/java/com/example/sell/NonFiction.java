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

public class NonFiction extends AppCompatActivity {

    Spinner spinner;
    Button button;
    String[] non_fic_type;
    String spinnerdata;
    String type;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_fiction);

        spinner=findViewById(R.id.select_non_fiction);
        button=findViewById(R.id.non_fiction_next);
        back=findViewById(R.id.non_fiction_back);

        type=getIntent().getExtras().getString("type");

        non_fic_type=getResources().getStringArray(R.array.non_fiction_chooser);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,non_fic_type);
        spinner.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NonFiction.this,MainActivity.class);
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
                    case "Biographies and Autobiographies":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[0]);
                        startActivity(intent);
                        break;

                    case "History and Politics":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[1]);
                        startActivity(intent);
                        break;

                    case "Business":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[2]);
                        startActivity(intent);
                        break;

                    case "Self-Help":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[3]);
                        startActivity(intent);
                        break;

                    case "Hobbies and Interests":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[4]);
                        startActivity(intent);
                        break;

                    case "Philosophy":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[5]);
                        startActivity(intent);
                        break;

                    case "Religion and Spirituality":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[6]);
                        startActivity(intent);
                        break;

                    case "Travel":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[7]);
                        startActivity(intent);
                        break;

                    case "Health and Fitness":
                        intent=new Intent(NonFiction.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+non_fic_type[8]);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
