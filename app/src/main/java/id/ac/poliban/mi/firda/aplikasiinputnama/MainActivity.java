package id.ac.poliban.mi.firda.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        Button btnTampil = findViewById(R.id.btnTampil);

        btnTampil.setOnClickListener(v -> {
            Toast.makeText(this, " Hai selamat bergabung " + etNama.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }

}