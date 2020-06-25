package com.example.sell;
import android.content.Context;
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

public class SchoolBookSelector extends Fragment {

    Spinner spinner;
    Button button;
    String[] sc_book_type;
    String spinnerdata;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_school_book_selector,container,false);

        spinner=(Spinner) v.findViewById(R.id.school_book_selector);
        button=(Button) v.findViewById(R.id.academic_sb_next);
        sc_book_type=getResources().getStringArray(R.array.school_book_chooser);

        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.support_simple_spinner_dropdown_item,sc_book_type);
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
                    case "Text Books":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: School Books: Text Books");
                        startActivity(intent);
                        break;

                    case "Sample Paper":
                        intent=new Intent(getActivity(),IncludeSomeDetails.class);
                        intent.putExtra("type","Academics: School Books: Sample Paper");
                        startActivity(intent);
                        break;
                }
            }
        });
        return v;
    }

}
