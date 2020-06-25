package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class UploadPhotos extends AppCompatActivity {

    String title,author,publisher,description,type,price;
    ImageButton back;
    Button select,upload;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_photos);

        back=findViewById(R.id.upload_photos_back);

        select=findViewById(R.id.select_pic);
        upload=findViewById(R.id.upload_pic);
        button=findViewById(R.id.upload_photo_next);

        title=getIntent().getExtras().getString("title");
        author=getIntent().getExtras().getString("author");
        publisher=getIntent().getExtras().getString("publisher");
        description=getIntent().getExtras().getString("description");
        type=getIntent().getExtras().getString("type");
        price=getIntent().getExtras().getString("price");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UploadPhotos.this,SetPrice.class);
                intent.putExtra("title",title);
                intent.putExtra("author",author);
                intent.putExtra("publisher",publisher);
                intent.putExtra("description",description);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(UploadPhotos.this,SetAddress.class);
                intent.putExtra("title",title);
                intent.putExtra("author",author);
                intent.putExtra("publisher",publisher);
                intent.putExtra("description",description);
                intent.putExtra("type",type);
                intent.putExtra("price",price);
                startActivity(intent);

            }
        });


    }
}
