package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.R;

public class HotelsFragment extends Fragment {
    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);

        // No:- 1 Monalisa Hotel And Restaurant activity

        TextView t1 = (TextView) view.findViewById(R.id.monalisa_hotel_and_restaurant_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), ActivityHotelsMonalisa.class);
                startActivity(i1);
            }
        });

        // No:-2 Swapnil Hotel Activity

        TextView t2 = (TextView) view.findViewById(R.id.swapnil_hotel_and_restaurant_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), ActivityHotelsSwapnil.class);
                startActivity(i2);
            }
        });

        // No.3 Shibkali Lodge activity

        TextView t3 = (TextView) view.findViewById(R.id.shibkali_lodge_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), ActivityHotelsShibkali.class);
                startActivity(i3);
            }
        });

        // No.4 Sree Hotel activty

        TextView t4 = (TextView) view.findViewById(R.id.sree_hotel_and_restaurant_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), ActivityHotelsSree.class);
                startActivity(i4);
            }
        });

        // No. 5  Hotel Laxmi Park activity

        TextView t5 = (TextView) view.findViewById(R.id.hotel_laxmi_park_textview);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), ActivityHotelsLaxmiPark.class);
                startActivity(i5);
            }
        });


        // No.6 Hotel Sneha activity

        TextView t6 = (TextView) view.findViewById(R.id.hotel_sneha_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), ActivityHotelsSneha.class);
                startActivity(i6);
            }
        });

        // No.7 Park Hotel activity

        TextView t7 = (TextView) view.findViewById(R.id.park_hotel_and_restaurant_textView);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), ActivityHotelsPark.class);
                startActivity(i7);
            }
        });

        // No.8 Hotel Raj activity

        TextView t8 = (TextView) view.findViewById(R.id.hotel_raj_and_restaurant_textView);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(getActivity(), ActivityHotelsRaj.class);
                startActivity(i8);
            }
        });

        // No.9 Hotel Annapurna activity

        TextView t9 = (TextView) view.findViewById(R.id.hotel_annapurna_textView);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(getActivity(), ActivityHotelsAnnapurna.class);
                startActivity(i9);
            }
        });


        return view;
    }
}
