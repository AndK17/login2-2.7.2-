package dev.andk.manyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.button2);
        int s = getIntent().getIntExtra("num", 0);
        btn.setOnClickListener(v -> {
            Toast.makeText(this, Integer.toString(s), Toast.LENGTH_SHORT).show();
            Intent i = new Intent();
            i.putExtra("kek", "CYBERPUNK");
            setResult(1, i);
            finish();
        });
    }
}