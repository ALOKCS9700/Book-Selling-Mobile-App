package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Preview extends AppCompatActivity {

    String title,author,publisher,description,type,price,address,pin_code,region;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        title=getIntent().getExtras().getString("title");
        author=getIntent().getExtras().getString("author");
        publisher=getIntent().getExtras().getString("publisher");
        description=getIntent().getExtras().getString("description");
        type=getIntent().getExtras().getString("type");
        price=getIntent().getExtras().getString("price");
        address=getIntent().getExtras().getString("address");
        pin_code=getIntent().getExtras().getString("pin_code");
        region=getIntent().getExtras().getString("region");

        t1=findViewById(R.id.title_preview);
        t2=findViewById(R.id.author_preview);
        t3=findViewById(R.id.publisher_preview);
        t4=findViewById(R.id.description_preview);
        t5=findViewById(R.id.type_preview);
        t6=findViewById(R.id.price_preview);
        t7=findViewById(R.id.address_preview);
        t8=findViewById(R.id.pin_code_preview);
        t9=findViewById(R.id.region_preview);

        t1.setText(title);
        t2.setText(author);
        t3.setText(publisher);
        t4.setText(description);
        t5.setText(type);
        t6.setText(price);
        t7.setText(address);
        t8.setText(pin_code);
        t9.setText(region);
    }
}
