package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button entrance_exam;
    Button academic;
    Button lit_and_fiction;
    Button non_fiction;
    Button young_readers;
    Button self_help;
    Button business;
    Button indian_lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrance_exam=findViewById(R.id.entrance_exam);
        academic=findViewById(R.id.academic);
        lit_and_fiction=findViewById(R.id.lit_and_fiction);
        non_fiction=findViewById(R.id.non_fiction);
        young_readers=findViewById(R.id.young_readers);
        self_help=findViewById(R.id.self_help);
        business=findViewById(R.id.business);
        indian_lang=findViewById(R.id.indian_lang);
    }

    public void sellStart(View view) {
        Intent intent;

        switch (view.getId())
        {
            case R.id.entrance_exam:
                intent=new Intent(MainActivity.this,EntranceExam.class);
                intent.putExtra("type","Entrance Exam: ");
                startActivity(intent);
                break;

            case R.id.academic:
                intent=new Intent(MainActivity.this,Academics.class);
                intent.putExtra("type","Academics: ");
                startActivity(intent);
                break;

            case R.id.lit_and_fiction:
                intent=new Intent(MainActivity.this,LiteratureAndFiction.class);
                intent.putExtra("type","Literature & Fiction: ");
                startActivity(intent);
                break;

            case R.id.non_fiction:
                intent=new Intent(MainActivity.this,NonFiction.class);
                intent.putExtra("type","Non Fiction: ");
                startActivity(intent);
                break;

            case R.id.young_readers:
                intent=new Intent(MainActivity.this,YoungReaders.class);
                intent.putExtra("type","Young Readers: ");
                startActivity(intent);
                break;

            case R.id.self_help:
                intent=new Intent(MainActivity.this,IncludeSomeDetails.class);
                intent.putExtra("type","Self Help");
                startActivity(intent);
                break;

            case R.id.business:
                intent=new Intent(MainActivity.this,IncludeSomeDetails.class);
                intent.putExtra("type","Business");
                startActivity(intent);
                break;

            case R.id.indian_lang:
                intent=new Intent(MainActivity.this,IndianLanguages.class);
                intent.putExtra("type","Indian Languages: ");
                startActivity(intent);
                break;

        }
    }
}
