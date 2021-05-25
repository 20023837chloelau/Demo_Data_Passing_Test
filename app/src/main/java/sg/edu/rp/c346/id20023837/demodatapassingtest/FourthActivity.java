package sg.edu.rp.c346.id20023837.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvReceive3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvReceive3 = findViewById(R.id.textViewDouble);

        Intent intentReceived = getIntent();
        double textReceived = intentReceived.getDoubleExtra("double",99.99);
        tvReceive3.setText("Double value is : " + textReceived);
    }
}