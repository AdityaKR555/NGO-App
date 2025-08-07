package com.example.ngoapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FormFragment extends Fragment {


    EditText nameInput, contactInput, cityInput;
    Button submitBtn;

    public FormFragment() {
        // Required empty public constructor
    }


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_form, container, false);
        nameInput = view.findViewById(R.id.editName);
        contactInput = view.findViewById(R.id.editContact);
        cityInput = view.findViewById(R.id.editCity);
        submitBtn = view.findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(v -> {
            String name = nameInput.getText().toString().trim();
            String contact = contactInput.getText().toString().trim();
            String city = cityInput.getText().toString().trim();

            if (name.isEmpty() || contact.isEmpty() || city.isEmpty()) {
                Toast.makeText(getActivity(), "Please fill all fields!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "Thanks, " + name + "!", Toast.LENGTH_SHORT).show();
                nameInput.setText("");
                contactInput.setText("");
                cityInput.setText("");
            }
        });


        return view;
    }
}