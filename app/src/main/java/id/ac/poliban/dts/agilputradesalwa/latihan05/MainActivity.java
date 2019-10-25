package id.ac.poliban.dts.agilputradesalwa.latihan05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAjax = findViewById(R.id.btAjaxAmsterdam);
        Button btFiorentina = findViewById(R.id.btFiorentina);
        Button btRealMadrid = findViewById(R.id.btRealMadrid);

        //event handler
        btAjax.setOnClickListener(view -> Toast.makeText(this, "HI Ajax", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(view -> Toast.makeText(this, "HI Fiorentina", Toast.LENGTH_SHORT).show());
        btRealMadrid.setOnClickListener(view -> Toast.makeText(this, "HI RealMadrid", Toast.LENGTH_SHORT).show());
    }
}
