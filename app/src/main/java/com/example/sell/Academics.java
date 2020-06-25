package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Academics extends AppCompatActivity {

    Spinner spinner;
    String spinnerdata;
    String[] acdemic;
    String type;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        spinner=findViewById(R.id.select_school_or_he);
        acdemic=getResources().getStringArray(R.array.academic_chooser);
        back=findViewById(R.id.academics_back);

        type=getIntent().getExtras().getString("type");

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,acdemic);
        spinner.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Academics.this,MainActivity.class);
                startActivity(intent);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinnerdata=(String)spinner.getSelectedItem();

                switch (spinnerdata)
                {
                    case "----Select----":
                        Toast.makeText(Academics.this,"Please select your choice",Toast.LENGTH_SHORT).show();
                        FragmentManager manage=getSupportFragmentManager();
                        FragmentTransaction trans=manage.beginTransaction();
                        Nothing nothing=new Nothing();
                        trans.replace(R.id.frag,nothing);
                        trans.commit();
                        trans.addToBackStack("");
                        break;

                    case "School Books":
                        FragmentManager manager=getSupportFragmentManager();
                        FragmentTransaction transaction=manager.beginTransaction();
                        SchoolBookSelector school=new SchoolBookSelector();
                        transaction.replace(R.id.frag,school);
                        transaction.commit();
                        transaction.addToBackStack("");
                        break;

                    case "Higher Education":
                        FragmentManager manager1=getSupportFragmentManager();
                        FragmentTransaction transaction1=manager1.beginTransaction();
                        HEBookSelector book=new HEBookSelector();
                        transaction1.replace(R.id.frag,book);
                        transaction1.commit();
                        transaction1.addToBackStack("");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
