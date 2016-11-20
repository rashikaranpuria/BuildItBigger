package com.example.rashi.jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent=getIntent();
        String joke=intent.getStringExtra("joke");
        Log.d("just check",joke);
        TextView joke_text=(TextView)findViewById(R.id.joke_text);
        joke_text.setText(joke);
    }
}
