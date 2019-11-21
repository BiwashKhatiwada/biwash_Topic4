package com.example.biwash_topic4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] city = new String[]{ "Pokhara", "Bhaktapur", "Biratnagar", "Itahari","Urlabari"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstcities=findViewById(R.id.cities);
        ArrayAdapter cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, city);
        lstcities.setAdapter(cityAdapter);

    }
}
