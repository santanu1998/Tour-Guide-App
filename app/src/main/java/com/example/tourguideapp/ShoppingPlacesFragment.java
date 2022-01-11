package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.R;

public class ShoppingPlacesFragment extends Fragment {
    public ShoppingPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping_places, container, false);

        // No:- 1  JD Bazaar activity

        TextView t1 = (TextView) view.findViewById(R.id.jd_bazaar_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), ActivityShoppingPlacesJDBazaar.class);
                startActivity(i1);
            }
        });

        // No:-2 Kolkata Trends Activity

        TextView t2 = (TextView) view.findViewById(R.id.kolkata_trends_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), ActivityShoppingPlacesKolkataTrends.class);
                startActivity(i2);
            }
        });

        // No.3 Chandan Dress House activity

        TextView t3 = (TextView) view.findViewById(R.id.chandan_dress_house_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), ActivityShoppingPlacesChandanDressHouse.class);
                startActivity(i3);
            }
        });

        // No.4 Kaniska activty

        TextView t4 = (TextView) view.findViewById(R.id.kaniska_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), ActivityShoppingPlacesKaniska.class);
                startActivity(i4);
            }
        });

        // No. 5 Anuvab  activity

        TextView t5 = (TextView) view.findViewById(R.id.anuvab_textview);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), ActivityShoppingPlacesAnuvab.class);
                startActivity(i5);
            }
        });


        // No.6 Anuska activity

        TextView t6 = (TextView) view.findViewById(R.id.anuska_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), ActivityShoppingPlacesAnuska.class);
                startActivity(i6);
            }
        });

        // No.7 M/S Fatelal Oswal activity

        TextView t7 = (TextView) view.findViewById(R.id.m_s_fatelal_oswal_textView);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), ActivityShoppingPlacesFatelalOswal.class);
                startActivity(i7);
            }
        });

        // No.8 New Anuvab activity

        TextView t8 = (TextView) view.findViewById(R.id.new_anuvab_textView);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(getActivity(), ActivityShoppingPlacesNewAnuvab.class);
                startActivity(i8);
            }
        });

        // No.9 Mallabhum Silk Centre activity

        TextView t9 = (TextView) view.findViewById(R.id.mallabhum_silk_centre_textView);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(getActivity(), ActivityShoppingPlacesMallabhumSilkCentre.class);
                startActivity(i9);
            }
        });


        return view;
    }
}
