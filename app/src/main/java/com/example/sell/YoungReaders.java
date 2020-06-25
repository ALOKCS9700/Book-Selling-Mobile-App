package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class YoungReaders extends AppCompatActivity {

    Spinner spinner;
    Button button;
    String[] yreaders_type;
    String type;
    String spinnerdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_young_readers);

        spinner=findViewById(R.id.select_young_readers);
        button=findViewById(R.id.young_readers_next);

        type=getIntent().getExtras().getString("type");

        yreaders_type=getResources().getStringArray(R.array.young_readers_chooser);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,yreaders_type);
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
                    case "Up to 2 Years":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[0]);
                        startActivity(intent);
                        break;

                    case "2 to 5 Years":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[1]);
                        startActivity(intent);
                        break;

                    case "5 to 9 Years":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[2]);
                        startActivity(intent);
                        break;

                    case "9 to 12 Years":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[3]);
                        startActivity(intent);
                        break;

                    case "Young Adults":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[4]);
                        startActivity(intent);
                        break;

                    case "Teens":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[5]);
                        startActivity(intent);
                        break;

                    case "Classics":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[6]);
                        startActivity(intent);
                        break;

                    case "Literature":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[7]);
                        startActivity(intent);
                        break;

                    case "Action and Adventure":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[8]);
                        startActivity(intent);
                        break;

                    case "Knowledge and Learning":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[9]);
                        startActivity(intent);
                        break;

                    case "Fairy Tales and Folk Tales":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[10]);
                        startActivity(intent);
                        break;

                    case "Picture Books":
                        intent=new Intent(YoungReaders.this,IncludeSomeDetails.class);
                        intent.putExtra("type",type+yreaders_type[11]);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
