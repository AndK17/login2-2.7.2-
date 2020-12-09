package dev.andk.manyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.text);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("num", 17);
            startActivityForResult(i, 1);
        });
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case 1:
                tv.setText(data.getStringExtra("kek"));
                break;
        }
    }
}