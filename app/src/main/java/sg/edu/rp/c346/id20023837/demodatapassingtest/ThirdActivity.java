package sg.edu.rp.c346.id20023837.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvReceive2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvReceive2 = findViewById(R.id.textViewDouble);

        Intent intentReceived = getIntent();
        char textReceived = intentReceived.getCharExtra("char",'a');
        tvReceive2.setText("Character value is : " + textReceived);
    }
}