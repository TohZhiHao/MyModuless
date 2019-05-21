package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView c346;
    TextView c349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.c346);
        c349 = findViewById(R.id.c349);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Details.class);
                String c346Details = "Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2018\nSemester: 1\nModule Credit:4\nVenue:W66M";
                intent.putExtra("c346", c346Details);
                startActivity(intent);
            }
        });

        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), c349.class);
                String c349Details = "Module Code: C349\nModule Name: iPad Programming\nAcademic Year: 2014\nSemester: 1\nModule Credit:4\nVenue:W66H";
                intent.putExtra("c349", c349Details);
                startActivity(intent);
            }
        });
    }
}
