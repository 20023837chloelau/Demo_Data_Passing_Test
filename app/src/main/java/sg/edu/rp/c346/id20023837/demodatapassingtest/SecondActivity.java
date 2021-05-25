package sg.edu.rp.c346.id20023837.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvReceive = findViewById(R.id.textViewInt);

        Intent intentReceived = getIntent();
        int textReceived = intentReceived.getIntExtra("value", 1);
        tvReceive.setText("Integer value is : " + textReceived);
    }
}