package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class c349 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c349);


        setContentView(R.layout.activity_details);
        tv = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("c349");
        tv.setText(value);
    }
}
