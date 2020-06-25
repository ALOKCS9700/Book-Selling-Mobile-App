package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ReviewYourDetails extends AppCompatActivity {

    String title,author,publisher,description,type,price,address,pin_code,region;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_your_details);

        back=findViewById(R.id.review_your_details_back);

        title=getIntent().getExtras().getString("title");
        author=getIntent().getExtras().getString("author");
        publisher=getIntent().getExtras().getString("publisher");
        description=getIntent().getExtras().getString("description");
        type=getIntent().getExtras().getString("type");
        price=getIntent().getExtras().getString("price");
        address=getIntent().getExtras().getString("address");
        pin_code=getIntent().getExtras().getString("pin_code");
        region=getIntent().getExtras().getString("region");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ReviewYourDetails.this,SetAddress.class);
                intent.putExtra("title",title);
                intent.putExtra("author",author);
                intent.putExtra("publisher",publisher);
                intent.putExtra("description",description);
                intent.putExtra("type",type);
                intent.putExtra("price",price);
                startActivity(intent);
            }
        });

        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        VerifiedAccount verified=new VerifiedAccount(title,author,publisher,description,type,price,address,pin_code,region);
        transaction.replace(R.id.verify_frag,verified);
        transaction.commit();
        transaction.addToBackStack("");

    }
}
