package com.example.tourguideapp;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguideapp.R;

public class ActivityHotelsLaxmiPark extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_laxmi_park);


        ImageView i1 = (ImageView)findViewById(R.id.call_icon_image);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                Toast.makeText(ActivityHotelsLaxmiPark.this, "ALERT!. This is an INQUERY number", Toast.LENGTH_LONG).show();
                i1.setData(Uri.parse("tel: 03244 256 353 "));
                if(i1.resolveActivity(getPackageManager()) != null) {
                    startActivity(i1);
                }
            }
        });

        ImageView i2 = (ImageView)findViewById(R.id.web_search_image);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "https://www.makemytrip.com/hotels/hotel-details/?hotelId=201512081707471029&_uCurrency=INR&checkin=date_2&checkout=date_3&city=CTXOZ&cmp=SEM%7CD%7CDH%7CG%7CHname%7CHname_1S_NewList-Sep18_Exact%7C201512081707471029%7CETA%7CCoupon%7C482211922202&country=IN&ef_id=CjwKCAjwzt6LBhBeEiwAbPGOgQjVSYBkz_-s_t-BuTT3o9NRMv6VMPWiF2X-8rW3jON6oU-tXYJuFBoCNE8QAvD_BwE%3AG%3As&lat=23.06788&lng=87.31652&locusId=CTXOZ&locusType=city&rank=1&reference=hotel&roomStayQualifier=2e0e&s_kwcid=AL%211631%213%21482211922202%21e%21%21g%21%21hotel%20laxmi%20park%20bishnupur&searchText=Bishnupur&topHtlId=201512081707471029&type=city&mtkeys=defaultMtkeyhttps://www.google.com/maps/place/Hotel+Laxmi+Park/@23.0701846,87.3132205,17z/data=!3m1!4b1!4m8!3m7!1s0x39f793e3c86763a3:0x4112e12631521d5a!5m2!4m1!1i2!8m2!3d23.0702447!4d87.3152258";
                Intent i2 = new Intent(Intent.ACTION_WEB_SEARCH);
                i2.putExtra(SearchManager.QUERY, info);
                if (i2.resolveActivity(getPackageManager()) != null) {
                    startActivity(i2);
                }
            }
        });

        ImageView i3 = (ImageView)findViewById(R.id.google_map_search_image);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(mapIntent);
                }

            }
        });


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



    }

}
