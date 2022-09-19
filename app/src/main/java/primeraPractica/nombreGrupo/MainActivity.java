package primeraPractica.nombreGrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Spinner spinnerMoneda=findViewById(R.id.spinner);

        //ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.moneda, android.R.layout.simple_spinner_item);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.moneda));

        spinnerMoneda.setAdapter(adapter);
    }

}
