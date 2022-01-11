package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.R;

public class FoodStreetFragment extends Fragment {
    public FoodStreetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_street, container, false);

        // No:- 1 Mecha Sandesh activity

        TextView t1 = (TextView) view.findViewById(R.id.mecha_sandesh_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), ActivityFoodsMechaSandesh.class);
                startActivity(i1);
            }
        });

        // No:-2 Pera Activity

        TextView t2 = (TextView) view.findViewById(R.id.pera_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), ActivityFoodsPera.class);
                startActivity(i2);
            }
        });

        // No.3 Postor Bora activity

        TextView t3 = (TextView) view.findViewById(R.id.postor_bora_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), ActivityFoodsPostorBora.class);
                startActivity(i3);
            }
        });

        // No.4 Biryani activty

        TextView t4 = (TextView) view.findViewById(R.id.biryani_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), ActivityFoodsBiryani.class);
                startActivity(i4);
            }
        });

        // No. 5  Lassi activity

        TextView t5 = (TextView) view.findViewById(R.id.Lassi_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), ActivityFoodsLassi.class);
                startActivity(i5);
            }
        });


        // No.6 Chicken Pokoras activity

        TextView t6 = (TextView) view.findViewById(R.id.chicken_pakoras_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), ActivityFoodsChickenPokoras.class);
                startActivity(i6);
            }
        });

        // No.7 Momo activity

        TextView t7 = (TextView) view.findViewById(R.id.momo_textView);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), ActivityFoodsMomo.class);
                startActivity(i7);
            }
        });


        return view;
    }
}
