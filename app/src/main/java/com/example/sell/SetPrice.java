package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.PriorityQueue;

public class SetPrice extends AppCompatActivity {

    EditText price;
    Button button;
    String title,author,publisher,description,type,book_price;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_price);

        price=findViewById(R.id.sell_price);
        button=findViewById(R.id.set_price_next);
        back=findViewById(R.id.set_price_back);

        title=getIntent().getExtras().getString("title");
        author=getIntent().getExtras().getString("author");
        publisher=getIntent().getExtras().getString("publisher");
        description=getIntent().getExtras().getString("description");
        type=getIntent().getExtras().getString("type");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SetPrice.this,IncludeSomeDetails.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book_price=price.getText().toString();

                if(book_price.length()==0)
                {
                    Toast.makeText(SetPrice.this,"Please write the price of book",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Intent intent=new Intent(SetPrice.this,UploadPhotos.class);
                    intent.putExtra("title",title);
                    intent.putExtra("author",author);
                    intent.putExtra("publisher",publisher);
                    intent.putExtra("description",description);
                    intent.putExtra("type",type);
                    intent.putExtra("price",book_price);
                    startActivity(intent);
                }


            }
        });


    }
}
