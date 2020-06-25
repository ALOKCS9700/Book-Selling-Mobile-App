package com.example.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class SetAddress extends AppCompatActivity {

    EditText et1,et2;
    Spinner spinner;
    Button button;
    String address,pin_code,spinnerdata;
    String[] region;
    String title,author,publisher,description,type,price;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_address);

        et1=findViewById(R.id.address);
        et2=findViewById(R.id.pin_code);
        spinner=findViewById(R.id.choose_region);
        button=findViewById(R.id.address_next);
        back=findViewById(R.id.set_address_back);

        region=getResources().getStringArray(R.array.regions);

        title=getIntent().getExtras().getString("title");
        author=getIntent().getExtras().getString("author");
        publisher=getIntent().getExtras().getString("publisher");
        description=getIntent().getExtras().getString("description");
        type=getIntent().getExtras().getString("type");
        price=getIntent().getExtras().getString("price");

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,region);
        spinner=findViewById(R.id.choose_region);
        spinner.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SetAddress.this,UploadPhotos.class);
                intent.putExtra("title",title);
                intent.putExtra("author",author);
                intent.putExtra("publisher",publisher);
                intent.putExtra("description",description);
                intent.putExtra("type",type);
                intent.putExtra("price",price);
                startActivity(intent);
            }
        });

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
                address=et1.getText().toString();
                pin_code=et2.getText().toString();

                if(address.length()==0 || pin_code.length()==0)
                {
                    Toast.makeText(SetAddress.this,"Please fill all the details",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Intent intent;

                    intent=new Intent(SetAddress.this,ReviewYourDetails.class);
                    intent.putExtra("title",title);
                    intent.putExtra("author",author);
                    intent.putExtra("publisher",publisher);
                    intent.putExtra("description",description);
                    intent.putExtra("type",type);
                    intent.putExtra("price",price);
                    intent.putExtra("address",address);
                    intent.putExtra("pin_code",pin_code);
                    switch (spinnerdata)
                    {
                        case "Andaman and Nicobar Island":
                            intent.putExtra("region",region[0]);
                            startActivity(intent);
                            break;

                        case "Andhra Pradesh":
                            intent.putExtra("region",region[1]);
                            startActivity(intent);
                            break;

                        case "Arunachal Pradesh":
                            intent.putExtra("region",region[2]);
                            startActivity(intent);
                            break;

                        case "Assam":
                            intent.putExtra("region",region[3]);
                            startActivity(intent);
                            break;

                        case "Bihar":
                            intent.putExtra("region",region[4]);
                            startActivity(intent);
                            break;

                        case "Chandigarh":
                            intent.putExtra("region",region[5]);
                            startActivity(intent);
                            break;

                        case "Chhattisgarh":
                            intent.putExtra("region",region[6]);
                            startActivity(intent);
                            break;

                        case "Dadra and Nagar Haveli":
                            intent.putExtra("region",region[7]);
                            startActivity(intent);
                            break;

                        case "Daman and Diu":
                            intent.putExtra("region",region[8]);
                            startActivity(intent);
                            break;

                        case "Delhi":
                            intent.putExtra("region",region[9]);
                            startActivity(intent);
                            break;

                        case "Goa":
                            intent.putExtra("region",region[10]);
                            startActivity(intent);
                            break;

                        case "Gujarat":
                            intent.putExtra("region",region[11]);
                            startActivity(intent);
                            break;

                        case "Haryana":
                            intent.putExtra("region",region[12]);
                            startActivity(intent);
                            break;

                        case "Himachal Pradesh":
                            intent.putExtra("region",region[13]);
                            startActivity(intent);
                            break;

                        case "Jammu and Kashmir":
                            intent.putExtra("region",region[14]);
                            startActivity(intent);
                            break;

                        case "Jharkhand":
                            intent.putExtra("region",region[15]);
                            startActivity(intent);
                            break;

                        case "Karnataka":
                            intent.putExtra("region",region[16]);
                            startActivity(intent);
                            break;

                        case "Kerala":
                            intent.putExtra("region",region[17]);
                            startActivity(intent);
                            break;

                        case "Lakshadweep":
                            intent.putExtra("region",region[18]);
                            startActivity(intent);
                            break;

                        case "Madhya Pradesh":
                            intent.putExtra("region",region[19]);
                            startActivity(intent);
                            break;

                        case "Maharashtra":
                            intent.putExtra("region",region[20]);
                            startActivity(intent);
                            break;

                        case "Manipur":
                            intent.putExtra("region",region[21]);
                            startActivity(intent);
                            break;

                        case "Meghalaya":
                            intent.putExtra("region",region[22]);
                            startActivity(intent);
                            break;

                        case "Mizoram":
                            intent.putExtra("region",region[23]);
                            startActivity(intent);
                            break;

                        case "Nagaland":
                            intent.putExtra("region",region[24]);
                            startActivity(intent);
                            break;

                        case "Odisha":
                            intent.putExtra("region",region[25]);
                            startActivity(intent);
                            break;

                        case "Pondicherry":
                            intent.putExtra("region",region[26]);
                            startActivity(intent);
                            break;

                        case "Punjab":
                            intent.putExtra("region",region[27]);
                            startActivity(intent);
                            break;

                        case "Rajasthan":
                            intent.putExtra("region",region[28]);
                            startActivity(intent);
                            break;

                        case "Sikkim":
                            intent.putExtra("region",region[29]);
                            startActivity(intent);
                            break;

                        case "Tamil Nadu":
                            intent.putExtra("region",region[30]);
                            startActivity(intent);
                            break;

                        case "Telangana":
                            intent.putExtra("region",region[31]);
                            startActivity(intent);
                            break;

                        case "Tripura":
                            intent.putExtra("region",region[32]);
                            startActivity(intent);
                            break;

                        case "Uttar Pradesh":
                            intent.putExtra("region",region[33]);
                            startActivity(intent);
                            break;

                        case "Uttaranchal":
                            intent.putExtra("region",region[34]);
                            startActivity(intent);
                            break;

                        case "West Bengal":
                            intent.putExtra("region",region[35]);
                            startActivity(intent);
                            break;

                    }
                }

            }
        });

    }
}
