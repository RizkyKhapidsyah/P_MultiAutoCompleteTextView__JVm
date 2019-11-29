package com.rizkykhapidsyah.p_multiautocompletetextview__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MultiAutoCompleteTextView MACTV_Demo_IDJAVA;
    TextView TV_MultiAutoText_IDJAVA;

    String[] NamaHari = {
            "Minggu",
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jum'at",
            "Sabtu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MACTV_Demo_IDJAVA = findViewById(R.id.MACTV_Demo_IDXML);
        TV_MultiAutoText_IDJAVA = findViewById(R.id.TV_MultiAutoText_IDXML);

        StringBuilder S = new StringBuilder();
        S.append("Masukkan Input Value:").append("\n");

        for (String listValue : NamaHari) {
            S.append(listValue).append(", ");
        }

        TV_MultiAutoText_IDJAVA.setText(S);

        ArrayAdapter<String> LarikAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, NamaHari);
        MACTV_Demo_IDJAVA.setAdapter(LarikAdapter);
        MACTV_Demo_IDJAVA.setThreshold(1);
        MACTV_Demo_IDJAVA.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
