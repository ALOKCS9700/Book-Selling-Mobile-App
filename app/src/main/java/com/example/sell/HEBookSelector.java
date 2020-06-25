package com.example.sell;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class HEBookSelector extends Fragment {

    Spinner spinner;
    Button button;
    String[] he_book_type;
    String spinnerdata;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_hebook_selector,container,false);

        spinner=(Spinner) v.findViewById(R.id.higher_edu_selector);
        button=(Button) v.findViewById(R.id.academic_he_next);
        he_book_type=getResources().getStringArray(R.array.higher_education_chooser);

        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.support_simple_spinner_dropdown_item,he_book_type);
        spinner.setAdapter(adapter);

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
                Intent intent;

                switch (spinnerdata)
                {
                    case "Computers and Internet":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Computers and Internet");
                        startActivity(intent);
                        break;

                    case "Science":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Science");
                        startActivity(intent);
                        break;

                    case "Medical":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Medical");
                        startActivity(intent);
                        break;

                    case "Management":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Management");
                        startActivity(intent);
                        break;

                    case "Mathematics":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Mathematics");
                        startActivity(intent);
                        break;

                    case "Engineering":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Engineering");
                        startActivity(intent);
                        break;

                    case "Humanities":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Humanities");
                        startActivity(intent);
                        break;

                    case "Commerce":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: Commerce");
                        startActivity(intent);
                        break;

                    case "LAW":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: Higher Education: LAW");
                        startActivity(intent);
                        break;

                }
            }
        });
        return v;
    }

}
