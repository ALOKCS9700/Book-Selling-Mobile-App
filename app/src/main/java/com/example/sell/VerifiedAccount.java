package com.example.sell;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class VerifiedAccount extends Fragment {

    Button button;
    String title,author,publisher,description,type,price,address,pin_code,region;

    public VerifiedAccount(String title, String author, String publisher, String description, String type, String price, String address, String pin_code, String region) {

        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.description=description;
        this.type=type;
        this.price=price;
        this.address=address;
        this.pin_code=pin_code;
        this.region=region;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_verified_account,container,false);

        button=v.findViewById(R.id.post_now);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(),PostSuccesfully.class);
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

        return v;
    }
}
