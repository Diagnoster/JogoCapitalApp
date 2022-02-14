package com.example.jogocapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.editTextInput);
        TextView outResult = findViewById(R.id.textViewOutputResult);

        TextView out = findViewById(R.id.textViewOutputState);
        Random r = new Random();
        int num = r.nextInt(14);
        out.setText(estados[num]);

    }

    String[] estados = {
            "Paraná",
            "São Paulo",
            "Rio de Janeiro",
            "Santa Catarina",
            "Ceará",
            "Pará",
            "Pernambuco",
            "Minas Gerais",
            "Mato Grosso",
            "Rio Grande do Sul",
            "Amazonas",
            "Bahia",
            "Sergipe",
            "Acre",
            "Amapá"
    };

    String[] capitais = {
            "Curitiba",
            "São Paulo",
            "Rio de Janeiro",
            "Florianópolis",
            "Fortaleza",
            "Belém",
            "Recife",
            "Belo Horizonte",
            "Cuiabá",
            "Porto Alegre",
            "Manaus",
            "Salvador",
            "Aracaju",
            "Rio Branco",
            "Macapá"
    };




    public void checkChoice (View view) {
        /*TextView outResult = findViewById(R.id.textViewOutputResult);
        EditText input = findViewById(R.id.editTextInput);
        TextView out = findViewById(R.id.textViewOutputState);
        Random r = new Random();
        int num = r.nextInt(14);
        out.setText(estados[num]);

        String capitalCorrespondente = capitais[out.getTouchables().indexOf(r)];

        if(input == capitalCorrespondente) {
            outResult.setText(capitalCorrespondente);
        }


        int tries = 0;
        int points = 0;

        */

    }

    public void nextQuestion (View view) {
       /* if (tries < 5) {
            out.setText(estados[random]);
        } else {
            out.setText("Fim de jogo! Pontuação final: " + points );
        }*/

    }



}