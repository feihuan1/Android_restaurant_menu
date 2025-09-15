package com.example.hungrydev;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.WindowCompat;


public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView desertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main);
        desertsCard = findViewById(R.id.card_view_deserts);


        startersCard.setOnClickListener(v -> {
            Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

            startActivity(startersActivityIntent);
        });

        mainsCard.setOnClickListener(v -> {
            Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
            startActivity(mainCoursesActivityIntent);
        });

        desertsCard.setOnClickListener(v -> {
            Intent desertsActivityIntent = new Intent(MainActivity.this, DesertsActivity.class);
            startActivity(desertsActivityIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("IntentReset")
            @Override
            public void onClick(View v) {
                Intent launchEmailIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailIntent.setData(Uri.parse("mailto:pengfeihuan@gmail.com"));
                if (launchEmailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(launchEmailIntent);
                } else {
                    Toast.makeText(MainActivity.this, "No email client installed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}