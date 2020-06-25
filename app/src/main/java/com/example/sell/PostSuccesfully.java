package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PostSuccesfully extends AppCompatActivity {

    String title,author,publisher,description,type,price,address,pin_code,region;
    Button preview,back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_succesfully);

        preview=findViewById(R.id.preview);
        back_home=findViewById(R.id.back_to_home);

        title=getIntent().getExtras().getString("title");
        author=getIntent().getExtras().getString("author");
        publisher=getIntent().getExtras().getString("publisher");
        description=getIntent().getExtras().getString("description");
        type=getIntent().getExtras().getString("type");
        price=getIntent().getExtras().getString("price");
        address=getIntent().getExtras().getString("address");
        pin_code=getIntent().getExtras().getString("pin_code");
        region=getIntent().getExtras().getString("region");

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PostSuccesfully.this,MainActivity.class);
                startActivity(intent);
            }
        });

        preview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PostSuccesfully.this,Preview.class);
                intent.putExtra("title",title);
                intent.putExtra("author",author);
                intent.putExtra("publisher",publisher);
                intent.putExtra("description",description);
                intent.putExtra("type",type);
                intent.putExtra("price",price);
                intent.putExtra("address",address);
                intent.putExtra("pin_code",pin_code);
                intent.putExtra("region",region);
                startActivity(intent);
            }
        });


    }
}
