package br.com.helppet;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoDenuncia = (Button) findViewById(R.id.botaoDenuncia);
        context = this;
        botaoDenuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,DenunciasActivity.class);
                startActivity(i);
            }
        });
        Button botaoEvento = (Button) findViewById(R.id.botaoEvento);
        context = this;
        botaoEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,EventosActivity.class);
                startActivity(i);
            }
        });
    }
    private Context context;



}
