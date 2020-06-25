package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class IncludeSomeDetails extends AppCompatActivity {

    EditText title,author,publisher,description;
    Button button;
    String type;
    ImageButton back;
    String book_title;
    String book_author;
    String book_publisher;
    String book_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include_some_details);

        title=findViewById(R.id.book_title);
        author=findViewById(R.id.book_author);
        publisher=findViewById(R.id.book_publisher);
        description=findViewById(R.id.description);
        back=findViewById(R.id.include_some_details_back);

        button=findViewById(R.id.isd_next);

        back=findViewById(R.id.include_some_details_back);

        type=getIntent().getExtras().getString("type");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IncludeSomeDetails.this,MainActivity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book_title=title.getText().toString();
                book_author=author.getText().toString();
                book_publisher=publisher.getText().toString();
                book_description=description.getText().toString();

                if(book_title.length()==0 || book_author.length()==0 || book_publisher.length()==0 || book_description.length()==0)
                {
                    Toast.makeText(IncludeSomeDetails.this,"Please fill all the details",Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent intent = new Intent(IncludeSomeDetails.this, SetPrice.class);
                    intent.putExtra("title", book_title);
                    intent.putExtra("author", book_author);
                    intent.putExtra("publisher", book_publisher);
                    intent.putExtra("description", book_description);
                    intent.putExtra("type", type);
                    startActivity(intent);
                }


            }
        });

    }
}
