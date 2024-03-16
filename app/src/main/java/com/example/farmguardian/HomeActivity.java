package com.example.farmguardian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView logOff = findViewById(R.id.Logout);
        CardView  animalcaretaker = findViewById(R.id.animalcaretaker);
        CardView news = findViewById(R.id.News);
        CardView Equipment = findViewById(R.id.Equipment);
         CardView livestock  = findViewById(R.id.LivestockACT);

        Equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Equipment.class));
            }
        });
        animalcaretaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              startActivity(new Intent(HomeActivity.this,animalCaretaker.class));

            }

        });
        livestock.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             startActivity(new Intent(HomeActivity.this,LivestockActivity.class));
                                         }
                                     });
        news.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(HomeActivity.this, NewsActivity.class));
                    }
        });


        logOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                LoginActivityFirebase.saveLoginStatus(getApplicationContext(), false);


                Intent intent = new Intent(HomeActivity.this, LoginActivityFirebase.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }
        });
    }


}