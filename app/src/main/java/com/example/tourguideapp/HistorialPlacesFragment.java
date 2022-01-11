package com.example.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.R;

public class HistorialPlacesFragment extends Fragment {
    Activity context;

    public HistorialPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_historial_places, container, false);

        // No:- 1

        TextView t1 = (TextView) view.findViewById(R.id.ras_mancha_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), ActivityHistoricalRasMancha.class);
                startActivity(i1);
            }
        });

        // No:-2

        TextView t2 = (TextView) view.findViewById(R.id.pancha_ratna_shyam_rai_temple_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), ActivityHistoricalPanchaRatnaShyamRaiTemple.class);
                startActivity(i2);
            }
        });

        // No:-3

        TextView t3 = (TextView) view.findViewById(R.id.joreBangla_temple_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), ActivityHistoricalJoreBanglaTemple.class);
                startActivity(i3);
            }
        });

        // No:-4

        TextView t4 = (TextView) view.findViewById(R.id.madan_mohan_temple_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), ActivityHistoricalMadanMohanTemple.class);
                startActivity(i4);
            }
        });

        // No:-5

        TextView t5 = (TextView) view.findViewById(R.id.radhe_shyam_temple_textview);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), ActivityHistoricalRadheShyamTemple.class);
                startActivity(i5);
            }
        });


        // No:-6


        TextView t6 = (TextView) view.findViewById(R.id.lalji_temple_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), ActivityHistoricalLaljiTemple.class);
                startActivity(i6);
            }
        });

        TextView t7 = (TextView) view.findViewById(R.id.dalmadal_kaman_textView);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), ActivityHistoricalDalmadalKaman.class);
                startActivity(i7);
            }
        });

        TextView t8 = (TextView) view.findViewById(R.id.mrinmoyee_temple_textView);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(getActivity(), ActivityHistoricalMrinmoyeeTemple.class);
                startActivity(i8);
            }
        });
        return view;
    }
}
