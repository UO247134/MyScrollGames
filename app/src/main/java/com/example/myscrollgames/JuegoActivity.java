package com.example.myscrollgames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class JuegoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        LinearLayout layout = findViewById(R.id.linearLayout);

        layout.addView(createText("Dark Souls 3"));
        layout.addView(createText("Fecha Lanzamiento: 12/04/2016"));
        layout.addView(createText("Género: Acción/RPG"));
        layout.addView(createText("Plataforma: Third Party"));
        layout.addView(createText("Compañía: From Software"));
        layout.addView(createText("Comentarios: "));

    }

    private TextView createText(String txt){
        TextView txtView = new TextView(getApplicationContext());
        txtView.setText(txt);
        txtView.setTextSize(30);
        return txtView;


    }
}
